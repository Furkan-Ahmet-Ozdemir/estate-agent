package com.patika.estateagent.contoller;

import com.patika.estateagent.dto.request.ResidenceSearchRequest;
import com.patika.estateagent.dto.response.GenericResponse;
import com.patika.estateagent.model.Residence;
import com.patika.estateagent.service.GeneralService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/general")
public class GeneralContoller {
    private final GeneralService generalService;

    @GetMapping("/calculateallhousesprice")
    public GenericResponse<Long> calculateAllHouses() {
        return GenericResponse.success(generalService.calculateAllHouses());
    }

    @GetMapping("/calculateallsummerhousessprice")
    public GenericResponse<Long> calculateAllSummerHouses() {
        return GenericResponse.success(generalService.calculateAllSummerHouses());
    }

    @GetMapping("/calculateallvillasprice")
    public GenericResponse<Long> calculateAllVilla() {
        return GenericResponse.success(generalService.calculateAllVilla());
    }

    @GetMapping("/calculateallresidencesaverageprice")
    public GenericResponse<Long> calculateAllResidencesAveragePrice() {
        return GenericResponse.success(generalService.calculateAllResidencesAveragePrice());
    }

    @GetMapping("/calculatesummerhousesaveragem2")
    public GenericResponse<Integer> getSummerHousesAverageM2() {
        return GenericResponse.success(generalService.getSummerHousesAverageM2());
    }

    @GetMapping("/calculatehousesaveragem2")
    public GenericResponse<Integer> getHousesAverageM2() {
        return GenericResponse.success(generalService.getHousesAverageM2());
    }

    @GetMapping("/calculatevillasaveragem2")
    public GenericResponse<Integer> getVillasAverageM2() {
        return GenericResponse.success(generalService.getVillasAverageM2());
    }

    @GetMapping("/calculateallresidencesaveragem2")
    public GenericResponse<Integer> getAllResidencesAverageM2() {
        return GenericResponse.success(generalService.getAllResidencesAverageM2());
    }

    @PostMapping("/listbyroomcountandhallcount")
    public GenericResponse<List<Residence>> residenceListByRoomCountAndHallCount(@RequestBody ResidenceSearchRequest request) {
        return GenericResponse.success(generalService.residenceListByRoomCountAndHallCount(request.getRoomCount(), request.getHallCount()));
    }

}

