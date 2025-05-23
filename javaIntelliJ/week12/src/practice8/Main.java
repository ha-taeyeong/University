package practice8;

public class Main {
    public static void main(String[] args) {
        String str = "hallymbigdata";
        int firstIdx = str.indexOf('a');
        int secondIdx = str.indexOf('a', firstIdx+1);
        System.out.println(firstIdx);
        System.out.println(secondIdx);
        if(firstIdx != -1 && secondIdx != -1 && secondIdx > firstIdx) {
            String substr = str.substring(firstIdx + 1, secondIdx);
            System.out.println("첫 번째 'a'와 두번째 'a' 사이의 문자열: " + substr);
        } else {
            System.out.println("문자 'a'가 두 번 이상 등장하지 않습니다.");
        }
    }
}
