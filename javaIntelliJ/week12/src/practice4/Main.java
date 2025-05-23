package practice4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주사위 던질 횟수를 입력하세요");

        int n = sc.nextInt();
        System.out.println("1) --------------------------------------");
        for (int i = 0; i < n; i++) {
            int random1 = (int)(Math.random() * 6) +1;
            System.out.println("주사위를 굴립니다 -> 현재 주사위 상태 : " + random1);
        }

        System.out.println("2) --------------------------------------");
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int random2 = random.nextInt(6) +1;
            System.out.println("주사위를 굴립니다 -> 현재 주사위 상태 : " + random2);
        }
    }
}
