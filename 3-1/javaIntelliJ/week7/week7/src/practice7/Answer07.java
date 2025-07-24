package practice7;

public class Answer07 {
    public static void move(Action action, String media) {
        action.play(media);
    }
    public static void main(String[] args) {
        move(Ref::piano, "피아노");
        move(Ref::soccer, "축구");
        move(Ref::game, "게임");
    }
}
