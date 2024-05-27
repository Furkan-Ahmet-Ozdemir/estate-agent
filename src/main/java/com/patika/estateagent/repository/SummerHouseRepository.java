package com.patika.estateagent.repository;
import com.patika.estateagent.model.House;
import com.patika.estateagent.model.SummerHouse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SummerHouseRepository {

    private static SummerHouseRepository instance;
    private List<SummerHouse> summerHouseList = new ArrayList<>();

    public static SummerHouseRepository getInstance() {
        if (instance == null) {
            synchronized (SummerHouseRepository.class) {
                if (instance == null) {
                    instance = new SummerHouseRepository();
                }
            }
        }
        return instance;
    }

    public void create(SummerHouse summerHouse) {
        summerHouseList.add(summerHouse);
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }

    public Optional<SummerHouse> findById(Long id) {
        return getSummerHouseList().stream()
                .filter(summerHouse -> summerHouse.getId().equals(id))
                .findFirst();
    }
}
