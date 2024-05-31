package com.patika.estateagent;

import com.patika.estateagent.dto.request.HouseSaveRequest;
import com.patika.estateagent.dto.request.SummerHouseSaveRequest;
import com.patika.estateagent.dto.request.VillaSaveRequest;
import com.patika.estateagent.model.Residence;
import com.patika.estateagent.service.GeneralService;
import com.patika.estateagent.service.HouseService;
import com.patika.estateagent.service.SummerHouseService;
import com.patika.estateagent.service.VillaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EstateAgentApplication {

    public static void main(String[] args) throws ClassNotFoundException{

        SpringApplication.run(EstateAgentApplication.class, args);

//        HouseService houseService = new HouseService();
//        SummerHouseService summerHouseService = new SummerHouseService();
//        VillaService villaService = new VillaService();
//        GeneralService generalService = new GeneralService();
//
//
//        HouseSaveRequest house1 = new
//                HouseSaveRequest(1L, "Deniz Manzaralı Ev", "Güzel bir ev", 150000L, 120, 4, 1, 4, 42);
//        HouseSaveRequest house2 = new
//                HouseSaveRequest(2L, "Orman Manzaralı Ev", "Güzel bir ev", 130000L, 100, 3, 1, 9, 93);
//        HouseSaveRequest house3 = new
//                HouseSaveRequest(3L, "Manzarasız Ev", "Güzel bir ev", 110000L, 80, 2, 1, 7, 77);
//        HouseSaveRequest house4 = new
//                HouseSaveRequest(4L, "Manzarasız Ev", "Güzel bir ev", 110000L, 5000, 2, 1, 7, 77);
//
//
//        houseService.save(house1);
//        houseService.save(house2);
//        houseService.save(house3);
//        houseService.save(house4);
//
//
//        SummerHouseSaveRequest summerHouse1 = new
//                SummerHouseSaveRequest(1L, "3 katl Muht. Ev", "Güzel bir ev", 210000L, 160, 4, 2, 3, true);
//        SummerHouseSaveRequest summerHouse2 = new
//                SummerHouseSaveRequest(2L, "2 katl Muht. Ev", "Güzel bir ev", 245000L, 180, 5, 2, 2, false);
//        SummerHouseSaveRequest summerHouse3 = new
//                SummerHouseSaveRequest(3L, "4 katl Muht. Ev", "Güzel bir ev", 310000L, 200, 6, 1, 4, true);
//
//        summerHouseService.save(summerHouse1);
//        summerHouseService.save(summerHouse2);
//        summerHouseService.save(summerHouse3);
//
//
//        VillaSaveRequest villa1 =
//                new VillaSaveRequest(1L, "Villa 4 katl Muht. Ev", "Güzel bir ev", 410000L, 210, 6, 1, 4, true);
//        VillaSaveRequest villa2 =
//                new VillaSaveRequest(2L, "Villa 3 katl Muht. Ev", "Güzel bir ev", 300000L, 190, 6, 1, 3, true);
//        VillaSaveRequest villa3 =
//                new VillaSaveRequest(3L, "Villa 2 katl Muht. Ev", "Güzel bir ev", 220000L, 200, 6, 1, 2, true);
//
//        villaService.save(villa1);
//        villaService.save(villa2);
//        villaService.save(villa3);
//
//        System.out.println("House List: " + houseService.getHouseList());
//        System.out.println("SummerHouse List: " + summerHouseService.getSummerHouseList());
//        System.out.println("Villa List: " + villaService.getVillaList());
//
////        Evlerin toplam fiyatlarını dönen bir metot
//        System.out.println("Evlerin toplam fiyatı:" + generalService.calculateAllHouses());
//
////        Villaların toplam fiyatlarını dönen bir metot
//        System.out.println("Villaların toplam fiyatı:" + generalService.calculateAllVilla());
//
////        Yazlıkların toplam fiyatlarını dönen metot
//        System.out.println("Yazlıkların toplam fiyatı:" + generalService.calculateAllSummerHouses());
//
////        Tüm tipteki evlerin toplam fiyatını dönen metot
//        System.out.println(" Tüm tipteki evlerin toplam fiyatı:" + generalService.calculateAllResidencesAveragePrice());
//
////        Evlerin ortalama metrekaresini dönen bir metot
//        System.out.println(" Evlerin ortalama metrekaresi:" + generalService.getHousesAverageM2());
//
////        Villaların ortalama metrekaresini dönen bir metot
//        System.out.println(" Villaların ortalama metrekaresi:" + generalService.getVillasAverageM2());
//
////        Yazlıkların ortalama metrekaresini dönen metot
//        System.out.println(" Yazlıkların ortalama metrekaresi:" + generalService.getSummerHousesAverageM2());
//
////        Tüm tipteki evlerin ortalama metrekaresini dönen metot
//        System.out.println(" Tüm tipteki evlerin ortalama metrekaresi:" + generalService.getAllResidencesAverageM2());
//
////        Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot
//        System.out.println(" Oda ve salon sayısına göre tüm:" + generalService.residenceListByRoomCountAndHallCount(6,1));
//        System.out.println( generalService.residenceListByRoomCountAndHallCount(6,1).stream().map(house -> "Name: " + house.getName() + "Id: " + house.getId().toString() ).toList());



    }

}
