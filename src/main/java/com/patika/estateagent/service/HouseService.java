package com.patika.estateagent.service;
import com.patika.estateagent.converter.HouseConverter;
import com.patika.estateagent.dto.request.HouseSaveRequest;
import com.patika.estateagent.dto.response.HouseResponse;
import com.patika.estateagent.model.House;
import com.patika.estateagent.repository.HouseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class HouseService {

    private final HouseRepository houseRepository;

    public void save(HouseSaveRequest request) throws ClassNotFoundException{

        Optional<House> foundHouse = houseRepository.findById(request.getId());

        if(foundHouse.isPresent()) {
            log.error("HOUSE_ALREADY_EXIST");
            throw new ClassNotFoundException();
        }

        House house = HouseConverter.toHouse(request);

        houseRepository.create(house);

        log.info("House created. Name: "  + house.getName() + "id: " + house.getId());
    }

    public List<House> getHouseList(){
        return (houseRepository.getHouseList());
    }

    public List<HouseResponse> getHouseResponseList(){
        return HouseConverter.toHouseResponse(houseRepository.getHouseList());
    }

}
