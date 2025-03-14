interface Electronics {
    void turnOn();
    void turnOff();
}
class TV implements Electronics {
    @Override
    public void turnOff() {
        System.out.println("Turning off TV");
    }
    @Override
    public void turnOn(){
        System.out.println("Turning On TV");
    }
}
class Radio implements Electronics {
    @Override
    public void turnOff() {
        System.out.println("Turning off Radio");
    }
    @Override
    public void turnOn(){
        System.out.println("Turning On Radio");
    }
}
public class BT04 {
    public static void main(String[] args) {
        Electronics[] electronics = new Electronics[2];
        electronics[0] = new TV();
        electronics[1] = new Radio();
        for(int i = 0; i < electronics.length; i++){
            electronics[i].turnOff();
            System.out.println("-----------------------");
            electronics[i].turnOn();
            System.out.println("-----------------------");
        }
    }
}
