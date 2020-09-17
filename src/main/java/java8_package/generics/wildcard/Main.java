package java8_package.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Building> buildingList = new ArrayList<>();
        Building b1 = new Building(1);
        Building b2 = new Building(2);
        addToList(buildingList,b1);
//        addToList(buildingList,b2);
//
       List<House> houseList = new ArrayList<>();
       House h1 = new House(3,"Hn1");
        House h2 = new House(4,"Hn2");
        addToList(houseList,h1);
//        addToList(houseList,h2);
//
//        printList(buildingList);

        House building = new House(123,"Hno");
        System.out.println(building);
    }

    static void addToList(List<? extends Building> b, Building obj){
        //b.add(obj);
    }

    static void printList(List<? super House> b){
       b.stream().forEach(System.out::println);
    }
}
