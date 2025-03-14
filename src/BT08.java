abstract class Car2 {
    private String model;
    private int year;
    private int price;
    public Car2(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public abstract void start();
    public abstract void stop();
    public String getInfo() {
        return model + " (Năm SX: " + year + ", Giá: $" + price + ")";
    }
}

interface Refuelable {
    void refuel();
}
class ElectricCar extends Car2 implements Refuelable {
    public ElectricCar(String model, int year, int price) {
        super(model, year, price);
    }
    @Override
    public void start() {
        System.out.println("Xe điện " + getInfo() + " đã khởi động không tiếng ồn.");
    }
    @Override
    public void stop() {
        System.out.println("Xe điện " + getInfo() + " đã dừng và ngắt kết nối động cơ.");
    }

    @Override
    public void refuel() {
        System.out.println("Xe điện " + getInfo() + " đang sạc điện…");
    }
}

class GasCar extends Car2 implements Refuelable {
    public GasCar(String model, int year, int price) {
        super(model, year, price);
    }
    @Override
    public void start() {
        System.out.println("Xe chạy xăng " + getInfo() + " đã khởi động với tiếng động cơ.");
    }
    @Override
    public void stop() {
        System.out.println("Xe chạy xăng " + getInfo() + " đã dừng và động cơ tắt.");
    }
    @Override
    public void refuel() {
        System.out.println("Xe chạy xăng " + getInfo() + " đang được đổ xăng...");
    }
}
class Garage  {
    private Car2[] cars = {
            new ElectricCar("Tesla", 120, 100),
            new GasCar("Toyota", 120, 100),
            new GasCar("Toyota", 120, 100),
            new ElectricCar("Vinfast", 120, 100),
    };
    public void fullStart(){
        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
        }
    }
    public void fullStop(){
        for (int i = 0; i < cars.length; i++) {
            cars[i].stop();
        }
    }
    public void fullRefuel() {
        for (int i = 0; i < cars.length; i++) {
            ((Refuelable) cars[i]).refuel();
        }
    }
}
public class BT08 {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.fullStart();
        System.out.println("---------------------");
        garage.fullStop();
        System.out.println("---------------------");
        garage.fullRefuel();
    }
}
