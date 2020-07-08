package Florian;

public class F_V_Main {
    public static void main(String[] args) {

        F_Car car1 = new F_Car("BMW", "3", 4, 250, 190, 5, 6);
        F_Bike bike1 = new F_Bike("Yamaha", "R1", 2, 300, 196, 112);
        F_Truck truck1 = new F_Truck("MAN", "3000", 6, 120, 650,6);

        car1.printCar();
        System.out.println();

        bike1.printBike();
        System.out.println();

        truck1.printTruck();

    }
}
