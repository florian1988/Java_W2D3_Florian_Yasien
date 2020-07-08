package JAVA.W2D3.fasy;

public class IntermediateInheritance {



    public static class Vehicle{
        String brand;
        String model;
        int numberOfWheels;
        float maxSpeed;

        public Vehicle(String brand, String model, int numberOfWheels, float maxSpeed){
            this.brand = brand;
            this.model = model;
            this.numberOfWheels = numberOfWheels;
            this.maxSpeed = maxSpeed;
        }
    }


    public static class Car extends Vehicle{
        int ownersSalary;
        public Car(String brand, String model, int numberOfWheels, float maxSpeed, int ownersSalary) {
            super(brand, model, numberOfWheels, maxSpeed);
            this.ownersSalary = ownersSalary;
        }

        public String getBrand(){
            return super.brand;
        }

        public String getModel(){
            return super.model;
        }

        public int getOwnersSalary(){
            return this.ownersSalary;
        }


        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", numberOfWheels=" + numberOfWheels +
                    ", maxSpeed=" + maxSpeed +
                    ", ownersSalary=" + ownersSalary +
                    '}';
        }
    }








    public static void main(String[] args) {

        Car porsche = new Car("Porsche", "911", 4, 220f, 70000 );
        System.out.println(porsche);

        System.out.println("the " + porsche.getBrand() + " driver earns " + porsche.getOwnersSalary() + "€");

    }
}
