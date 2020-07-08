package Florian;

import java.util.*;

public class F_A1 {
    public static void main(String[] args) {

        ArrayList < String > ListCities = new ArrayList < String > ();

        ListCities.add("Linz");
        ListCities.add("Wien");
        ListCities.add("Graz");
        ListCities.add("Innsbruck");
        ListCities.add("St. Pölten");
        ListCities.add("Salzburg");

        ArrayList < Integer > TempCities = new ArrayList < Integer > ();

        TempCities.add(15);
        TempCities.add(21);
        TempCities.add(17);
        TempCities.add(20);
        TempCities.add(10);
        TempCities.add(20);

        String city;

        for (int i =0; i < ListCities.size(); i++ ){

             city = new String (ListCities.get(i) + " " + TempCities.get(i));

            //System.out.println(ListCities.get(i) + " Temp.: " + TempCities.get(i));
            //System.out.println(city);

            ListCities.set(i, city);
            System.out.println(ListCities.get(i));
        }


    }

}
