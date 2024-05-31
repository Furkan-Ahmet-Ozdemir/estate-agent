package com.patika.estateagent.converter;
import com.patika.estateagent.dto.request.HouseSaveRequest;
import com.patika.estateagent.dto.response.HouseResponse;
import com.patika.estateagent.model.House;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HouseConverter {
    public static House toHouse(HouseSaveRequest request) {
        return new House(request.getId(),request.getName(),request.getDescription(),request.getPrice(),request.getM2(),request.getRoomCount(),request.getHallCount(), request.getFloorNumber(),request.getFlatNumber());
    }

    public static HouseResponse toHouseResponse(House houseResponse) {
        return HouseResponse.builder()
                .m2(houseResponse.getM2())
                .id(houseResponse.getId())
                .price(houseResponse.getPrice())
                .name(houseResponse.getName())
                .description(houseResponse.getDescription())
                .flatNumber(houseResponse.getFlatNumber())
                .floorNumber(houseResponse.getFloorNumber())
                .hallCount(houseResponse.getHallCount())
                .roomCount(houseResponse.getRoomCount())
                .build();
    }

    public static List<HouseResponse> toHouseResponse(List<House> houses) {
        return houses
                .stream()
                .map(HouseConverter::toHouseResponse)
                .toList();
    }
}
