package practice11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"오이", "강아지", "자바", "생강", "소나기", "우동", "언어"};
        Random random = new Random();

        System.out.println("끝말 잇기 게임을 시작합니다~~~");
        String randomStr = str[random.nextInt(str.length)];

        while(true){
            char randomLast = randomStr.charAt(randomStr.length()-1);
            System.out.print(randomStr + "의 " + randomLast + "로 시작하는 단어 >> ");
            String s = sc.next();

            char first = s.charAt(0);

            if(first == randomLast){
                // 성공시 randomStr 갱신
                randomStr = s;
            } else {
                // 실패시
                System.out.println("틀렸습니다.");
                System.out.print("계속하겠습니까 ? >> ");
                s = sc.next();
                if (s.equalsIgnoreCase("c")){
                    System.out.println("끝말 잇기 게임을 시작합니다~~~");
                    randomStr = str[random.nextInt(str.length)];
                    continue;
                } else {
                    break;
                }
            }
        }
        sc.close();
        System.out.println("게임을 종료 합니다.");
    }
}
