package com.patika.estateagent.model;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Villa extends Residence{
    private Integer floorCount;
    private boolean hasPool;

    public Villa(Long id, String name, String description, Long price, Integer m2, Integer roomCount, Integer hallCount, Integer floorCount, boolean hasPool){
        super(id, name, description, price, m2, roomCount, hallCount);
        this.floorCount = floorCount;
        this.hasPool = hasPool;
    }

}
