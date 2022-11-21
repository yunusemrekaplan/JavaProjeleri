public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Yunus Emre Kaplan", 14000, 100, 2020);
        employee1.ToString();
        System.out.println();
        Manager manager1 = new Manager("Ahmet Demir",14000,100,2020,15);
        manager1.ToString();
        manager1.RaiseEmployee(100);
    }
}