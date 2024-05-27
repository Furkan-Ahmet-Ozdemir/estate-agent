package com.patika.estateagent.service;
import com.patika.estateagent.converter.HouseConverter;
import com.patika.estateagent.converter.SummerHouseConverter;
import com.patika.estateagent.dto.request.HouseSaveRequest;
import com.patika.estateagent.dto.request.SummerHouseSaveRequest;
import com.patika.estateagent.model.House;
import com.patika.estateagent.model.SummerHouse;
import com.patika.estateagent.repository.RepositoryFactory;
import com.patika.estateagent.repository.SummerHouseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class SummerHouseService {

    private SummerHouseRepository summerHouseRepository = RepositoryFactory.createSummerHouseRepository();;

    public void save(SummerHouseSaveRequest request) throws ClassNotFoundException{

        Optional<SummerHouse> foundSummerHouse = summerHouseRepository.findById(request.getId());

        if (foundSummerHouse.isPresent()) {
            log.error("SUMMER_HOUSE_ALREADY_EXIST");
            throw new ClassNotFoundException();
        }

        SummerHouse summerHouse = SummerHouseConverter.toSummerHouse(request);

        summerHouseRepository.create(summerHouse);

        log.info("SummerHouse created. {0} id: {}", summerHouse.getName() + summerHouse.getId());
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseRepository.getSummerHouseList();
    }


}
