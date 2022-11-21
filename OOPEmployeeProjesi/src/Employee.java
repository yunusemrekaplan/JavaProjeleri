public class Employee {
    private String name;
    private int workHours, hireYear;
    private double salary, tax, bonus, raise;

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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHireYear() {
        return hireYear;
    }
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    public int getWorkHours() {
        return workHours;
    }
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getRaise() {
        return raise;
    }
    public void setRaise(double raise) {
        this.raise = raise;
    }
}
