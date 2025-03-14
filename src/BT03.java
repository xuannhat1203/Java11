abstract class Vehicle {
    String name;
    int speed;
    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    abstract void displayInfo();
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }
    @Override
    void displayInfo() {
        System.out.println("Car Name: " + name + ", Speed: " + speed + " km/h");
    }
}
class Bike extends Vehicle {
    public Bike(String name, int speed) {
        super(name, speed);
    }
    @Override
    void displayInfo() {
        System.out.println("Bike Name: " + name + ", Speed: " + speed + " km/h");
    }
}


public class BT03 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120);
        myCar.start();
        myCar.displayInfo();
        System.out.println("-------------------------------");
        Bike myBike = new Bike("Honda", 80);
        myBike.start();
        myBike.displayInfo();
    }
}
