package com.patika.estateagent.repository;

import com.patika.estateagent.model.House;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class HouseRepository {
    private List<House> houseList = new ArrayList<>();

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
