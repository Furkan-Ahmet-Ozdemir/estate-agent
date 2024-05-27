package com.patika.estateagent.dto.request;
import com.patika.estateagent.model.Residence;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HouseSaveRequest extends Residence {
    private Integer floorNumber;
    private Integer flatNumber;

    public HouseSaveRequest(Long id, String name, String description, Long price, Integer m2, Integer roomCount, Integer hallCount, Integer floorNumber, Integer flatNumber){
        super(id, name, description, price, m2, roomCount, hallCount);
        this.floorNumber = floorNumber;
        this.flatNumber = flatNumber;
    }
}
