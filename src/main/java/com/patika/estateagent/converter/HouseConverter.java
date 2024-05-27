package com.patika.estateagent.converter;
import com.patika.estateagent.dto.request.HouseSaveRequest;
import com.patika.estateagent.model.House;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HouseConverter {
    public static House toHouse(HouseSaveRequest request) {
        return new House(request.getId(),request.getName(),request.getDescription(),request.getPrice(),request.getM2(),request.getRoomCount(),request.getHallCount(), request.getFloorNumber(),request.getFlatNumber());
    }
}
