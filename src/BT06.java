abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void sound();
    public abstract void move();

}
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }
    @Override
    public void sound() {
        System.out.println("Roar!");
    }
    @Override
    public void move(){
        System.out.println("The lion is running");
    }
}
class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }
    @Override
    public void sound() {
        System.out.println("Trumpet!");
    }
    @Override
    public void move(){
        System.out.println("The elephant is walking");
    }
}
class Zoo {
    private final Animal[] animals = new Animal[2];
    public Zoo() {
        animals[0] = new Lion("Lion", 30);
        animals[1] = new Elephant("Elephant", 30);
    }
    public void display() {
        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();
            animals[i].move();
            System.out.println("---------------");
        }
    }
}
public class BT06 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.display();
    }
}
