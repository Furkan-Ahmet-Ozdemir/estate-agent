package com.patika.estateagent.dto.request;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ResidenceSearchRequest {
    private Integer roomCount;
    private Integer hallCount;
}
