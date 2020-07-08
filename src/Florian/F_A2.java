package Florian;

import java.util.*;

public class F_A2 {

    public static void main(String[] args) {

        ArrayList< String > ListCities = new ArrayList < String > ();

        ListCities.add("Linz");
        ListCities.add("Wien");
        ListCities.add("Graz");
        ListCities.add("Innsbruck");
        ListCities.add("St. Pölten");
        ListCities.add("Salzburg");

        for(String city : ListCities){
            System.out.println(city);
        }
        System.out.println();

        String stuff = new String("werner");

        // 5 change the fist value

        ListCities.add(0,stuff);

        for(String city : ListCities){
            System.out.println(city);
        }
        System.out.println();

        // 2 add another array to the array

        ArrayList< String > OtherList = new ArrayList< String >();

        OtherList.add("Melk");
        OtherList.add("Krems");
        OtherList.add("Bregenz");

        ListCities.addAll(OtherList);

        // 3 print it out in different iterations

        for(int i = 0; i < ListCities.size(); i++ ){
            System.out.println(ListCities.get(i));
        }

        System.out.println();

        int x = 0;
        while(x < ListCities.size()){
            System.out.println(ListCities.get(x));
            x++;

        }

        System.out.println();

        for(String city : ListCities){
            System.out.println(city);
        }
        // 4 methods

        System.out.println(ListCities.spliterator());
        System.out.println();
        System.out.println(ListCities.contains(1));


        System.out.println();

        // 1 Sort the array

        Collections.sort(ListCities);

        for (String city : ListCities){
          System.out.println(city);
        }





    }

}
