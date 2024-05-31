package com.patika.estateagent.converter;

import com.patika.estateagent.dto.request.SummerHouseSaveRequest;
import com.patika.estateagent.dto.response.HouseResponse;
import com.patika.estateagent.dto.response.SummerHouseResponse;
import com.patika.estateagent.model.House;
import com.patika.estateagent.model.SummerHouse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SummerHouseConverter {

    public static SummerHouse toSummerHouse(SummerHouseSaveRequest request) {
        return new SummerHouse(request.getId(),request.getName(),request.getDescription(),request.getPrice(),request.getM2(),request.getRoomCount(),request.getHallCount(),request.getFloorCount(), request.isInHousingEstate());
    }

    public static SummerHouseResponse toResponse(SummerHouse summerHouseResponse) {
        return SummerHouseResponse.builder()
                .m2(summerHouseResponse.getM2())
                .id(summerHouseResponse.getId())
                .price(summerHouseResponse.getPrice())
                .name(summerHouseResponse.getName())
                .description(summerHouseResponse.getDescription())
                .hallCount(summerHouseResponse.getHallCount())
                .roomCount(summerHouseResponse.getRoomCount())
                .build();
    }

    public static List<SummerHouseResponse> toResponse(List<SummerHouse> houses) {
        return houses
                .stream()
                .map(SummerHouseConverter::toResponse)
                .toList();
    }
}
