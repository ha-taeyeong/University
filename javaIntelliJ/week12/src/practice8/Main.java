package practice8;

public class Main {
    public static void main(String[] args) {
        String str = "hallymbigdata";
        int firstIdx = str.indexOf("a");
        int secondIdx = str.indexOf("a", firstIdx+1);
        String substr = str.substring(firstIdx+1, secondIdx);
        System.out.println("str = " + str);
        System.out.println("문자 a에서 a까지의 문자는 모두 " + substr.length() + "개 입니다.");
        System.out.println("substr = " + substr);
    }
}
