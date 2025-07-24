package practice10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : "); // sdfgedgd
        String s = sc.next();

        System.out.print("문자 입력 : ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(s + " 문자열에서 " + ch + " 문자는 " + count + "번 반복됩니다.");
        sc.close();
        System.out.println("프로그램 종료");
    }
}
