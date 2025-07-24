package week5.practice3;

public class Test {
    public static void play(Animal ani) {
        ani.run();
        ani.sound();
    }
    public static void main(String[] args) {
        play(new Baby("신생아"));
        play(new Dog("강아지"));
    }
}
