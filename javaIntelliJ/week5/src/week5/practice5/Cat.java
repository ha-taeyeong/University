package week5.practice5;

public class Cat extends Animal {

    // 생성자
    public Cat(String name) {
        super(name, false);
    }

    // 메소드
    public Cat() {
        this("Anoymous");
    }

    @Override
    public String getType() {
        return "고양이";
    }

    @Override
    public void sound() {
        System.out.print(" 야~옹");
    }
}
