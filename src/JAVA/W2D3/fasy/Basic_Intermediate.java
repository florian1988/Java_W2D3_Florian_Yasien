package JAVA.W2D3.fasy;


import java.util.ArrayList;
import java.util.Collections;

public class Basic_Intermediate {
    public static void main(String[] args) {


//A1------------------------------------------------------
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Vienna");
        cities.add("Linz");
        cities.add("Graz");
        cities.add("Salzburg");
        cities.add("Klagenfurt");
        cities.add("Tirol");

        for(String c : cities){
            System.out.println(c);
        }


        ArrayList<Float> temps = new ArrayList<>();
        temps.add(22.7f);
        temps.add(18.2f);
        temps.add(5.4f);
        temps.add(12.9f);
        temps.add(11.1f);
        temps.add(35.2f);

        for(float f : temps){
            System.out.println(f);
        }

        class City {
            String city;
            float temp;

            public City(String city, float temp){
                this.city = city;
                this.temp = temp;

            }

            @Override
            public String toString() {
                return  city + ", " +
                        temp + "°C";
            }
        }

        ArrayList<City> data = new ArrayList<>();

        for(int i=0; i<cities.size(); i++) {
            data.add(new City(cities.get(i), temps.get(i)));
        }
        System.out.println("=========================");
        for(City c : data){
            System.out.println(c);
        }

//A2----------------------------------------
        System.out.println("=========================");

        Collections.sort(cities);
        for(String c : cities){
            System.out.println(c);
        }
        ArrayList<String> newCities = new ArrayList<>();
        newCities.add("Völklabruck");
        newCities.add("Buxdehude");
        newCities.add("Kaffingen");
        System.out.println();
        cities.addAll(newCities);
        for(String c : cities){
            System.out.println(c);
        }


        System.out.println();
        Collections.sort(cities);
        for(String c : cities){
            System.out.println(c);
        }
        System.out.println();
        for(String s:cities){
            System.out.println(s);
        }

        System.out.println();
        int i =0;
        while(i< cities.size()){
            System.out.println(cities.get(i));
            i++;
        }

        System.out.println();
        cities.add(0, "newElement");
        for(String s:cities){
            System.out.println(s);
        }

        if(cities.contains("Vienna")){
            System.out.println("Yooo Vienna found on position " + (cities.indexOf("Vienna")+1) + "!");

        }

//Basic_Intermediate
//A3----------------------------------------------------------
        System.out.println("=========================");

        cities.set(7, "Skiiiiiiiing!");


        System.out.println();
        for(String s:cities){
            System.out.println(s);
        }
        System.out.println("=============REVERSE SORTED============");

        Collections.sort(cities, Collections.reverseOrder());
        System.out.println();
        for(String s:cities){
            System.out.println(s);
        }


    }
}
