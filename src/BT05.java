import java.util.ArrayList;
import java.util.List;

interface Colorable {
    void setColor(String color);
}

class Circle implements Colorable {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        System.out.println("Circle: " + color);
    }
}

class Rectangle implements Colorable {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setColor(String color) {
        System.out.println("Rectangle: " + color);
    }
}

class Square implements Colorable {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void setColor(String color) {
        System.out.println("Square: " + color);
    }
}

public class BT05 {
    public static void main(String[] args) {
        Colorable[] colorables = new Colorable[3];
        colorables[0] = new Circle(5);
        colorables[1] = new Square(10);
        colorables[2] = new Rectangle(5,10);
        colorables[0].setColor("Red");
        colorables[1].setColor("Blue");
        colorables[2].setColor("Green");
    }
}
