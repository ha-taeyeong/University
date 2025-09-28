package practice7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random();

        while(set.size() < 6) {
            int num = random.nextInt(90) + 10; // 10 ~ 99의 정수
            set.add(num);
        }
        System.out.println("두 자수 로또 번호 6개를 출력합니다.");
        System.out.println(set);
    }
}
