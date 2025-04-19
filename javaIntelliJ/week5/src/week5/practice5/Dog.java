package week5.practice5;

class Dog extends Animal {

    // Dog 개수 변수 선언
    private static int countDog = 0;

    // 생성자
    // 피드백 수정
    public Dog(String name) {
        super(name);
        countDog++;
    }

    // 메소드
    public Dog() {
        this("Anoymous");
    }

    @Override
    public void sound() {
        System.out.print(" 멍멍");
    }

    public static int getCountDog() {
        return countDog;
    }
}
