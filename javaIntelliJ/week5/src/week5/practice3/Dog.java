package week5.practice3;

public class Dog extends Animal {
    public Dog(String type) {
        super(type);
    }

    @Override
    void run(){
        System.out.println(getType() + " : 네 발로 다닙니다.");
    }

    @Override
    void sound(){
        System.out.println(getType() + " : 멍멍 소리를 냅니다.");
    }
}
