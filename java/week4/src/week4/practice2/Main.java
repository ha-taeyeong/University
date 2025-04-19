package week4.practice2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();

        Dog dog = new Dog("Buddy");
        dog.makeSound();

        Cat cat = new Cat("Whiskers");
        cat.makeSound();
    }
}