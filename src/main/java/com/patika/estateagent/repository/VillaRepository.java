package com.patika.estateagent.repository;
import com.patika.estateagent.model.Villa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class VillaRepository {
    private static VillaRepository instance;
    private List<Villa> villaList = new ArrayList<>();

    public static VillaRepository getInstance() {
        if (instance == null) {
            synchronized (VillaRepository.class) {
                if (instance == null) {
                    instance = new VillaRepository();
                }
            }
        }
        return instance;
    }

    public void create(Villa summerHouse) {
        villaList.add(summerHouse);
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public Optional<Villa> findById(Long id) {
        return getVillaList().stream()
                .filter(villa -> villa.getId().equals(id))
                .findFirst();
    }
}
