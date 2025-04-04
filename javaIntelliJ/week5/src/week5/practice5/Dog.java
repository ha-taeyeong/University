package week5.practice5;

class Dog extends Animal {

    // Dog 개수 변수 선언
    private static int countDog = 0;

    // 생성자
    public Dog(String name) {
        super(name, true);
        countDog++;
    }

    // 메소드
    public Dog() {
        this("Anoymous");
    }

    @Override
    public String getType() {
        return "강아지";
    }

    @Override
    public void sound() {
        System.out.print(" 멍멍");
    }

    public static int getCountDog() {
        return countDog;
    }
}
