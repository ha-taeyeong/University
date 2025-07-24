package practice5;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("hallym", 55);
        Player player2 = new Player("hallym", 55);
        Player player3 = new Player("software", 55);
        System.out.println(player1);
        System.out.println(player2);
        if( player1.equals(player2) && (player1.hashCode() == player2.hashCode())) {
            System.out.println("동등한 객체입니다.");
        } else {
            System.out.println("서로 다른 객체입니다.");
        }

        System.out.println(player1);
        System.out.println(player3);
        if( player1.equals(player3) && (player1.hashCode() == player3.hashCode())) {
            System.out.println("동등한 객체입니다.");
        } else {
            System.out.println("서로 다른 객체입니다.");
        }
    }
}
