// Polymorphism
public class Main {
    public static void speaktry(Animal animal) {
        animal.speak();
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Hayvan");
        Bird bird = new Bird("Limon");
        Dog dog = new Dog("Karabaş");
        Horse horse = new Horse("Karabaş");

        /*
        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();
        */
        speaktry(new Bird("Kuş"));
    }
}