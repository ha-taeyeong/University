package week4.practice7;

public class Main {

	public static void main(String[] args) {

        Animal dog = new Dog("Dog");
        Animal cat = new Cat("Cat");
        Animal bird = new Bird("Bird");

        dog.eat();
        dog.sound();
        cat.eat();
        cat.sound();
        bird.eat();
        bird.sound();
        
	}

}
