package com.patika.estateagent.contoller;

import com.patika.estateagent.dto.request.HouseSaveRequest;
import com.patika.estateagent.dto.response.GenericResponse;
import com.patika.estateagent.dto.response.HouseResponse;
import com.patika.estateagent.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/houses")
@RequiredArgsConstructor
public class HouseContoller {

    private final HouseService houseService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody HouseSaveRequest request) throws ClassNotFoundException{
        houseService.save(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public GenericResponse<List<HouseResponse>> getAll() {
        return GenericResponse.success(houseService.getHouseResponseList());
    }
}
