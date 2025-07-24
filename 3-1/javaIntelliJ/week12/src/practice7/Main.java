package practice7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = "자바 프로그램은 재미 없습니다. 어렵습니다";

        System.out.println("=====indexOf() 메소드 사용=====");
        if(str.indexOf(s) == -1){
            System.out.println("해당 문자가 없습니다.");
        } else {
            System.out.println(s + " 인덱스는 " + str.indexOf(s) + " 입니다.");
        }

        System.out.println("=====charAt() 메소드 사용=====");
        boolean flag = false;
        for(int i = 0; i < str.length(); i++) {
            char ch = s.charAt(0);
            if(ch == str.charAt(i)){
                System.out.println(s + " 인덱스는 " + i + " 입니다.");
                flag = true;
            }
        }

        if(!flag){
            System.out.println("해당 문자가 없습니다.");
        }

        sc.close();
        System.out.println("프로그램 종료");
    }
}
