package com.patika.estateagent.converter;
import com.patika.estateagent.dto.request.VillaSaveRequest;
import com.patika.estateagent.model.Villa;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VillaConverter {
    public static Villa toVilla(VillaSaveRequest request) {
        return new Villa(request.getId(),request.getName(),request.getDescription(),request.getPrice(),request.getM2(),request.getRoomCount(),request.getHallCount(), request.getFloorCount(),request.isHasPool());
    }
}
