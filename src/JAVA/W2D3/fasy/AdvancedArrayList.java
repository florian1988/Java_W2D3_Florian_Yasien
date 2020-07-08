package JAVA.W2D3.fasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class AdvancedArrayList {

//A4-------------------------------------------

    public static void main(String[] args) {

        class City {
            String name;
            int citizensNum;

            public City(String name, int citizensNum) {
                this.name = name;
                this.citizensNum = citizensNum;
            }

            @Override
            public String toString() {
                return name + " has " +
                        citizensNum + " citizens.";
            }

            public String getName(){
                return this.name;
            }

            public int getCitizensNum(){
                return this.citizensNum;
            }


        }

        City Vienna = new City("Vienna", 1000);
        City Tirol = new City("Tirol", 20000);
        City Linz = new City("Linz", 8000000);
        City Dornbirn = new City("Dornbirn", 3000);


        ArrayList<City> Cities = new ArrayList<>();
        Cities.add(Vienna);
        Cities.add(Tirol);
        Cities.add(Linz);
        Cities.add(Dornbirn);

        System.out.println("toString formatted:");
        for(City c : Cities){
            System.out.println(c);
        }


        class AustrianCities {
            ArrayList<City> cList = new ArrayList<>();

            public AustrianCities(ArrayList<City> cList) {
                this.cList = cList;
            }

            public void printCityNames() {
                for (City c : cList) {
                    System.out.println(c.name);
                }
            }

            public void printCityCitizenNumbers() {
                for (City c : cList) {
                    System.out.println(c.citizensNum);
                }
            }

            public void printAllCityData() {
                for (City c : cList) {
                    System.out.print(c.name + "................");
                    System.out.println(c.citizensNum);
                }
            }

            public void printTotalNumberOfCitizens(){
                int totalCitizens = 0;
                for (City c : cList){
                    totalCitizens += c.citizensNum;
                }
                System.out.println(totalCitizens);
            }

        }


        AustrianCities myAustrianCities = new AustrianCities(Cities);

        System.out.println();
        System.out.println("printCityNames:");
        myAustrianCities.printCityNames();
        System.out.println("printCityCitizenNumbers:");
        myAustrianCities.printCityCitizenNumbers();
        System.out.println();
        System.out.println("printAllCityData");
        myAustrianCities.printAllCityData();
        System.out.println("==============");
        System.out.print("TOTAL.............");
        myAustrianCities.printTotalNumberOfCitizens();

        System.out.println();
        System.out.println("==========SOOOORRRTTIIINNNNGGGGG=====NAAAMMMEEEE================");
        System.out.println();



        Comparator<City> nameComparatorAsc = new Comparator<City>() {
            @Override
            public int compare(City c1, City c2) {
                return (c1.getName().compareTo(c2.getName()));
            }
        };

        Comparator<City> nameComparatorDesc = new Comparator<City>() {
            @Override
            public int compare(City c1, City c2) {
                return (c2.getName().compareTo(c1.getName()));
            }
        };

        Collections.sort(Cities, nameComparatorAsc);

        System.out.println("nameComparatorAsc");
        for(City c : Cities){
            System.out.println(c);
        }

        System.out.println();
        Collections.sort(Cities, nameComparatorDesc);
        System.out.println("nameComparatorDesc");
        for(City c : Cities){
            System.out.println(c);
        }




        System.out.println();
        System.out.println("==========SOOOORRRTTIIINNNNGGGGG=====CITIZEEENNNSSS================");
        System.out.println();


        Comparator<City> citizensComparator = new Comparator<City>() {
            @Override
            public int compare(City c1, City c2) {
                if (c1.getCitizensNum() < c2.getCitizensNum()){
                    return -1;
                }
                else if(c1.getCitizensNum() > c2.getCitizensNum()){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        };

        Collections.sort(Cities, citizensComparator);


        for(City c : Cities){
            System.out.println(c);
        }


    }
}
