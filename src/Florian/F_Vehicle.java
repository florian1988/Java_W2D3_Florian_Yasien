package Florian;

public class F_Vehicle {

    String brand;
    String model;
    int numberOfWeels;
    int maxSpeed;
    int HP;



    public F_Vehicle(String brand, String model, int numberOfWeels, int maxSpeed, int HP){
        this.brand = brand;
        this.model = model;
        this.numberOfWeels = numberOfWeels;
        this.maxSpeed = maxSpeed;
        this.HP = HP;


    }

    public void printVehicle(){
        System.out.println("Brand: " + brand );
        System.out.println("Model: " + model);
        System.out.println("Number of weels: " + numberOfWeels);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Horse power: " + HP);
    }



}
