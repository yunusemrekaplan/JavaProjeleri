public class Manager extends Employee{
    private int num_of_employees;
    Manager(String name, int salary, int workHours, int hireYear, int num_of_employees) {
        super(name, salary, workHours, hireYear);
        this.num_of_employees = num_of_employees;
    }

    public void RaiseEmployee(int amount) {
        System.out.println("Çalışanlara " + amount + " tl zam yapıldı.");
    }
    @Override // Yöneticilerin çalışma bonusu daha fazla olacak şekilde ayarlandı.
    public void Bonus() {
        setBonus(getWorkHours() * 45);
    }

    @Override // Yöneticilerin maaşına daha fazla zam gelecek şekilde ayarlandı.
    public void RaiseSalary() {
        if(2022 - getHireYear() < 10) {
            setRaise(getSalary() * 8 / 100);
        }
        else if(2022 - getHireYear() < 20) {
            setRaise(getSalary() * 13 / 100);
        }
        else {
            setRaise(getSalary() * 18 / 100);
        }
    }

    @Override
    public void ToString() {
        super.ToString();
        System.out.println("Sorumlu kişi sayısı: "+ num_of_employees);
    }

    public int getNum_of_employees() {
        return num_of_employees;
    }
    public void setNum_of_employees(int num_of_employees) {
        this.num_of_employees = num_of_employees;
    }
}
