package com.patika.estateagent.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class House extends Residence{
    private Integer floorNumber;
    private Integer flatNumber;

    public House(Long id, String name, String description, Long price, Integer m2, Integer roomCount, Integer hallCount, Integer floorNumber, Integer flatNumber){
        super(id, name, description, price, m2, roomCount, hallCount);
        this.floorNumber = floorNumber;
        this.flatNumber = flatNumber;
    }
}
