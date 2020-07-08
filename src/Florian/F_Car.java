package Florian;

public class F_Car extends F_Vehicle{
    int Passangers;
    int Airbags;

    F_Car(String brand, String model, int numberOfWeels, int maxSpeed, int HP, int Passangers, int Airbags){
        super(brand, model, numberOfWeels, maxSpeed, HP);
        this.Passangers = Passangers;
        this.Airbags = Airbags;

    }

    public void car(){
        System.out.println( "Passengers: " + Passangers);
        System.out.println("Airbags: " + Airbags);
    }

    public void printCar(){

        printVehicle();
        car();
    }

}
