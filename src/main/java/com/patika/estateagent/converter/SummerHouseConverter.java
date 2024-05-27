package com.patika.estateagent.converter;

import com.patika.estateagent.dto.request.SummerHouseSaveRequest;
import com.patika.estateagent.model.SummerHouse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SummerHouseConverter {

    public static SummerHouse toSummerHouse(SummerHouseSaveRequest request) {
        return new SummerHouse(request.getId(),request.getName(),request.getDescription(),request.getPrice(),request.getM2(),request.getRoomCount(),request.getHallCount(),request.getFloorCount(), request.isInHousingEstate());
    }
}
