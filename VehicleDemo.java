abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a button");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        b.start();
    }
}