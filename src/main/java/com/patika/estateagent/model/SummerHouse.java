package com.patika.estateagent.model;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SummerHouse extends Residence {
    private Integer floorCount;
    private boolean isInHousingEstate;

    public SummerHouse(Long id, String name, String description, Long price, Integer m2, Integer roomCount, Integer hallCount, Integer floorCount, boolean isInHousingEstate){
        super(id, name, description, price, m2, roomCount, hallCount);
        this.floorCount = floorCount;
        this.isInHousingEstate = isInHousingEstate;
    }
}
