package week5.practice2;

// Apple 클래스는 Fruit 클래스를 상속받고 me() 메소드를 재정의합니다.
class Apple extends Fruit {
    @Override
    public void me() {
        System.out.println("나는 사과");
    }
}
