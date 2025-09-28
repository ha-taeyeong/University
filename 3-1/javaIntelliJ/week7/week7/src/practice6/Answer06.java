package practice6;

public class Answer06 {
    public static void main(String[] args) {
        Action action = (media) -> System.out.println(media + "하였습니다.");

        action.play("피아노 연주");
        action.play("축구경기를 ");
        action.play("게임을 ");
    }
}
