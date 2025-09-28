package practice9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("문자열 입력 : ");
            String s = sc.next();

            if(s.equals("finish")){
                break;
            }

            // reverse
            StringBuffer sb = new StringBuffer(s);
            String reversedStr = sb.reverse().toString();
            System.out.println(s + " => (reverse)" + reversedStr);
        }
        sc.close();
        System.out.println("프로그램 종료");
    }
}
