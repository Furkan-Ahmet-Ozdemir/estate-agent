package com.patika.estateagent.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Residence {
    private Long id;
    private String name;
    private String description;
    private Long price;
    private Integer m2;
    private Integer roomCount;
    private Integer hallCount;

}


