package com.patika.estateagent.service;


import com.patika.estateagent.model.Residence;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@RequiredArgsConstructor
@Service
@Slf4j
public class GeneralService {

    private final HouseService houseService;
    private final SummerHouseService summerHouseService;
    private final VillaService villaService;

    public Long calculateAllHouses(){
        return houseService.getHouseList().stream()
                .map(Residence::getPrice)
                .reduce(0L, Long::sum);
    }

    public Long calculateAllSummerHouses(){
        return summerHouseService.getSummerHouseList().stream()
                .map(Residence::getPrice)
                .reduce(0L, Long::sum);
    }

    public Long calculateAllVilla(){
        return villaService.getVillaList().stream()
                .map(Residence::getPrice)
                .reduce(0L, Long::sum);
    }

    public Long calculateAllResidencesAveragePrice(){
        return calculateAllSummerHouses() + calculateAllVilla() + calculateAllHouses();
    }

    public Integer getSummerHousesAverageM2(){
        if(summerHouseService.getSummerHouseList().size() > 0) {
            return summerHouseService.getSummerHouseList().stream()
                    .map(Residence::getM2)
                    .reduce(0, Integer::sum) / summerHouseService.getSummerHouseList().size();
        } else {
            throw new NullPointerException();
        }
    }

    public Integer getHousesAverageM2(){
        if(houseService.getHouseList().size() > 0) {
            return houseService.getHouseList().stream()
                    .map(Residence::getM2)
                    .reduce(0, Integer::sum) / houseService.getHouseList().size();
        } else {
            throw new NullPointerException();
        }
    }

    public Integer getVillasAverageM2(){
        if(villaService.getVillaList().size() > 0) {
            return villaService.getVillaList().stream()
                    .map(Residence::getM2)
                    .reduce(0, Integer::sum) / villaService.getVillaList().size();
        } else {
            throw new NullPointerException();
        }
    }


    public Integer getAllResidencesAverageM2(){
        return (getHousesAverageM2() * houseService.getHouseList().size() + getVillasAverageM2() * villaService.getVillaList().size() + getSummerHousesAverageM2() * summerHouseService.getSummerHouseList().size()) / (summerHouseService.getSummerHouseList().size() + villaService.getVillaList().size() + houseService.getHouseList().size());
    }

    public List<Residence> residenceListByRoomCountAndHallCount(Integer roomCount, Integer hallCount){
        List<Residence> residenceList = new ArrayList<>();

        residenceList.addAll(villaService.getVillaList().stream()
                .filter(residence -> Objects.equals(residence.getRoomCount(), roomCount) && Objects.equals(residence.getHallCount(), hallCount))
                .toList());

        residenceList.addAll(summerHouseService.getSummerHouseList().stream()
                .filter(residence -> Objects.equals(residence.getRoomCount(), roomCount) && Objects.equals(residence.getHallCount(), hallCount))
                .toList());

        residenceList.addAll(houseService.getHouseList().stream()
                .filter(residence -> Objects.equals(residence.getRoomCount(), roomCount) && Objects.equals(residence.getHallCount(), hallCount))
                .toList());

        return  residenceList;
    }



}
