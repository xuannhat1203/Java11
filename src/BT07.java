interface IEmployee{
    double calculateSalary();
    String getName();
}
abstract class Employee implements IEmployee{
    String name;
    int paymentPerHour;
    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPaymentPerHour(int paymentPerHour){
        this.paymentPerHour = paymentPerHour;
    }
    public int getPaymentPerHour(){
        return this.paymentPerHour;
    }
    public abstract double calculateSalary();
}
class PartTimeEmployee extends Employee {
    int workingHours;
    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    @Override
    public double calculateSalary() {
        return workingHours * getPaymentPerHour();
    }
}
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
    public double calculateSalary() {
        return  8 * getPaymentPerHour();
    }
}
public class BT07 {
    public static void main(String[] args) {
        PartTimeEmployee pt = new PartTimeEmployee("Lion", 30, 100);
        System.out.println(pt.calculateSalary());
        pt.setPaymentPerHour(50);
        System.out.println(pt.calculateSalary());
        FullTimeEmployee ft = new FullTimeEmployee("Cat", 30);
        System.out.println( ft.calculateSalary());
        ft.setPaymentPerHour(50);
        System.out.println( ft.calculateSalary());
    }
}
