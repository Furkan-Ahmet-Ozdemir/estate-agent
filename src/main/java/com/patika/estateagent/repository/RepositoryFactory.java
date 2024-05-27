package com.patika.estateagent.repository;


public class RepositoryFactory {

    public static HouseRepository createHouseRepository() {
        return HouseRepository.getInstance();
    }

    public static SummerHouseRepository createSummerHouseRepository(){
        return SummerHouseRepository.getInstance();
    }

    public static VillaRepository createVillaRepository(){
        return VillaRepository.getInstance();
    }

}
