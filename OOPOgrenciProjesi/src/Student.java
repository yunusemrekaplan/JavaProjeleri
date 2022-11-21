public class Student {
    private String name;
    private int id;
    private int yazili1;
    private int yazili2;
    private double ortalama;

    Student(String name, int id, int yazili1, int yazili2) {
        this.name = name;
        this.id = id;
        this.yazili1 = yazili1;
        this.yazili2 = yazili2;
        ortalamaHesapla();
        System.out.println("Studen Constructer calisti...");
    }
    public void ToString() {
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("yazili1: "+yazili1);
        System.out.println("yazili2: "+yazili2);
        System.out.println("ortalama: "+ortalama);
    }
    private void ortalamaHesapla() {
        ortalama = (yazili1 + yazili2) / 2;
    }
    public double getOrtalama() {
        return ortalama;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
