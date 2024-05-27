package com.patika.estateagent.dto.request;
import com.patika.estateagent.model.Residence;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SummerHouseSaveRequest extends Residence {
    private Integer floorCount;
    private boolean isInHousingEstate;

    public SummerHouseSaveRequest(Long id, String name, String description, Long price, Integer m2, Integer roomCount, Integer hallCount, Integer floorCount, boolean isInHousingEstate){
        super(id, name, description, price, m2, roomCount, hallCount);
        this.floorCount = floorCount;
        this.isInHousingEstate = isInHousingEstate;
    }
}
