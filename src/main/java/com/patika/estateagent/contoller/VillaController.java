package com.patika.estateagent.contoller;
import com.patika.estateagent.dto.request.VillaSaveRequest;
import com.patika.estateagent.dto.response.GenericResponse;
import com.patika.estateagent.dto.response.VillaResponse;
import com.patika.estateagent.service.VillaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/villas")
@RequiredArgsConstructor
public class VillaController {

    private final VillaService villaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody VillaSaveRequest request) throws ClassNotFoundException{
        villaService.save(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public GenericResponse<List<VillaResponse>> getAll(){
        return GenericResponse.success(villaService.getVillaResponseList());
    }
}
