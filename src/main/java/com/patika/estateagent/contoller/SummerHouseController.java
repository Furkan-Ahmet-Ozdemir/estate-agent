package com.patika.estateagent.contoller;

import com.patika.estateagent.dto.request.SummerHouseSaveRequest;
import com.patika.estateagent.dto.response.GenericResponse;
import com.patika.estateagent.dto.response.SummerHouseResponse;
import com.patika.estateagent.service.SummerHouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/summerhouses")
@RequiredArgsConstructor
public class SummerHouseController {

    private final SummerHouseService summerHouseService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody SummerHouseSaveRequest request) throws ClassNotFoundException{
        summerHouseService.save(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public GenericResponse<List<SummerHouseResponse>> getAll() {
        return GenericResponse.success(summerHouseService.getSummerHouseResponseList());
    }
}
