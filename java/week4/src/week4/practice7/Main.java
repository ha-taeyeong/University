package week4.practice7;

public class Main {

	public static void main(String[] args) {

        Animal dog = new Dog("Max", 5);
        Animal cat = new Cat("Whiskers", 3);
        Animal bird = new Bird("Tweety",  2);
       
        
        System.out.print("Dog: " + dog);
        dog.bark();
        System.out.print("Cat: " +cat);
        cat.meow();
        System.out.print("Bird: " +bird);
        bird.chirp();
	}

}
