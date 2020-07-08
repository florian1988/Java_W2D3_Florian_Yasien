package Florian;

public class F_Bike extends F_Vehicle{
    int soundVolume;

    F_Bike(String brand, String model, int numberOfWeels, int maxSpeed, int HP, int soundVolume){
        super(brand, model, numberOfWeels, maxSpeed, HP);
        this.soundVolume = soundVolume;
    }

    public void bike(){
        System.out.println("Sound volume: " + soundVolume);
    }
    public void printBike(){

        printVehicle();
        bike();
    }

}

