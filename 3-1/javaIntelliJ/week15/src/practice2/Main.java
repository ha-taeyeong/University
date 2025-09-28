package practice2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("out_a.txt",true);
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("문자를 입력하세요 : ");
            char c = sc.next().charAt(0);
            if (Character.toLowerCase(c) == 'q'){
                System.out.println(": out_a.txt에 모든 내용을 쓰고 종료합니다.");
                break;
            }
            fos.write(c);
        }
        fos.close();
        sc.close();
    }

}
