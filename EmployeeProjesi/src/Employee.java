public class Employee {
    private double salary;
    private int workHours;
    private int hireYear;
    private String name;
    private double tax;
    private double bonus;
    private double raise;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        Tax();
        Bonus();
        RaiseSalary();
    }
    public void Tax() {
        if(salary < 1000) {
            tax = 0;
        }
        else {
            tax = salary * 3 / 100;
        }
    }
    public void Bonus() {
        bonus = workHours * 30;
    }
    public void RaiseSalary() {
        if(2022 - hireYear < 10) {
            raise = salary * 5 / 100;
        }
        else if(2022 - hireYear < 20) {
            raise = salary * 10 / 100;
        }
        else {
            raise = salary * 15 / 100;
        }
    }
    public void ToString() {
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
        System.out.println("Hire Date: "+ hireYear);
        System.out.println("Tax: "+ tax);
        System.out.println("Bonus: "+ bonus);
        System.out.println("Raise of Salary: "+ raise);
    }
    public double getTax() {
        return tax;
    }
    public double getBonus() {
        return bonus;
    }
    public double getRaise() {
        return raise;
    }
}
