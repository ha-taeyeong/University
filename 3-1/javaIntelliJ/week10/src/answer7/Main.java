package answer7;

import java.util.Scanner;

public class Main {
    public static void checkId(String id) throws NotUseId{
        char ch = id.charAt(0);
        if (id.length() < 8 ||
            !((ch >= 'a' && ch <= 'z')||
              (ch >= 'A' && ch <= 'Z'))) {
            throw new NotUseId(id + "는 사용할 수 없는 아이디 입니다.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력하세요");
        String id = sc.next();
        try {
            checkId(id);
            System.out.println(id + "는 사용 가능한 아이디 입니다.");
        } catch (NotUseId e){
            System.out.println(e.getMessage());
        }
    }
}
