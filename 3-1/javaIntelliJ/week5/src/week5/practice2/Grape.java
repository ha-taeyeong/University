package week5.practice2;

// Grape 클래스는 Fruit 클래스를 상속받고 me()와 save() 메소드를 재정의합니다.
class Grape extends Fruit {
    @Override
    public void me() {
        System.out.println("나는 포도");
    }

    @Override
    public String save() {
        return "저장할 수 없습니다";
    }
}