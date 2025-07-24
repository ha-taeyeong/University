package practice1;

public class Answer01 {
    public static void main(String[] args) {
        Action action = new Action("Dog") { // 상속을 받는 객체를 생성
            void move() {
                System.out.println(animal + " 는/은 네발로 걸어서 이동합니다.");
            };
        };
        action.move();
    }
}
