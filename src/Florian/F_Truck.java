package Florian;

public class F_Truck extends F_Vehicle{
        int weight;

        F_Truck(String brand, String model, int numberOfWeels, int maxSpeed, int HP, int weight ){
            super(brand, model, numberOfWeels, maxSpeed, HP);
            this.weight = weight;

        }

        public void truck(){
            System.out.println("Weight: " + weight);

        }

        public void printTruck(){

            printVehicle();
            truck();
        }
}
