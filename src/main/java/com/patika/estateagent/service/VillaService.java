package com.patika.estateagent.service;
import com.patika.estateagent.converter.SummerHouseConverter;
import com.patika.estateagent.converter.VillaConverter;
import com.patika.estateagent.dto.request.VillaSaveRequest;
import com.patika.estateagent.dto.response.SummerHouseResponse;
import com.patika.estateagent.dto.response.VillaResponse;
import com.patika.estateagent.model.SummerHouse;
import com.patika.estateagent.model.Villa;
import com.patika.estateagent.repository.VillaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class VillaService {
    private final VillaRepository villaRepository;

    public void save(VillaSaveRequest request) throws ClassNotFoundException{

        Optional<Villa> foundSummerHouse = villaRepository.findById(request.getId());

        if (foundSummerHouse.isPresent()) {
            log.error("VILLA_ALREADY_EXIST");
            throw new ClassNotFoundException();
        }

        Villa villa = VillaConverter.toVilla(request);

        villaRepository.create(villa);

        log.info("Villa created. {0} id: {}", villa.getName() + villa.getId());
    }

    public List<Villa> getVillaList() {
        return villaRepository.getVillaList();
    }



    public List<VillaResponse> getVillaResponseList(){
        return VillaConverter.toResponse(villaRepository.getVillaList());
    }



}
