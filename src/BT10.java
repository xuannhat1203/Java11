interface AttendMeeting {
    void attendMeeting();
}
abstract class Employees implements AttendMeeting {
    private String name;
    private double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();

    public abstract void takeVacation();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}



class Manager extends Employees implements AttendMeeting {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Quan li " + getName() + " ( Luong: " + getSalary() + ") " + "dang giam sat du an");
    }

    @Override
    public void takeVacation() {
        System.out.println("Quan li " + getName() + " ( Luong: " + getSalary() + ") " + "dang di nghi tai Phap");
    }

    public void attendMeeting() {
        System.out.println("Quan li " + getName() + " ( Luong: " + getSalary() + ") " + "dang tham gia cuoc hop");
    }
}

class Developer extends Employees {
    public Developer(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void work() {
        System.out.println("Lap trinh vien " + getName() + " ( Luong: " + getSalary() + ") " + "dang giam sat du an");
    }
    @Override
    public void takeVacation() {
        System.out.println("Lap trinh vien " + getName() + " ( Luong: " + getSalary() + ") " + "dang di nghi tai Phap");
    }

    @Override
    public void attendMeeting() {}
}

class Company {
    private Employees[] employees =
            {
                    new Manager("Xuan Nhat", 100),
                    new Manager("Nhat Xuan", 200),
                    new Developer("Trung Hieu", 300),
            };
    public void holdMeeting() {
        System.out.println("Công ty đang tổ chức cuộc họp...");
        for (int i = 0; i < employees.length; i++) {
            employees[i].attendMeeting();
        }
    }
    public void display(){
        for (int i = 0; i < employees.length; i++) {
            employees[i].takeVacation();
            employees[i].work();
        }
    }
}
public class BT10 {
    public static void main(String[] args) {
        Company company = new Company();
        company.holdMeeting();
        company.display();
    }
}
