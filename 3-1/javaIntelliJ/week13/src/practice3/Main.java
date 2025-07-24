package practice3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Calc cal = null; // 11, 31, 24, 53, 35, 78, 49, 55, 36, 96, 374, 35

        System.out.print("정수 문자열을 입력하세요. \n정수와 정수 사이는 ,(콤마)로 구분하세요 \n>> ");
        String digit_str = key.nextLine();
        cal = new Calc(digit_str);
        cal.show();
        System.out.printf("sum = %d\n", cal.sum());
    }
}
