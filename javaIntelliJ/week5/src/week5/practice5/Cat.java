package week5.practice5;

public class Cat extends Animal {

    // 생성자
    // 피드백 수정
    public Cat(String name) {
        super(name);
    }

    // 메소드
    public Cat() {
        this("Anoymous");
    }

    @Override
    public void sound() {
        System.out.print(" 야~옹");
    }
}
