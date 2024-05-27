package com.patika.estateagent.repository;

import com.patika.estateagent.model.House;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Repository
public class HouseRepository {

    private static HouseRepository instance;
    private List<House> houseList = new ArrayList<>();

    public static HouseRepository getInstance() {
        if (instance == null) {
            synchronized (HouseRepository.class) {
                if (instance == null) {
                    instance = new HouseRepository();
                }
            }
        }
        return instance;
    }

    public void create(House house) {
        houseList.add(house);
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public Optional<House> findById(Long id) {
        return getHouseList().stream()
                .filter(house -> house.getId().equals(id))
                .findFirst();
    }


}
