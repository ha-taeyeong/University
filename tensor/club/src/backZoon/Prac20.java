package backZoon;
/*
문제
상근이는 선영이와 함께 게임을 하고 있다. 먼저, 상근이는 두 양의 정수 A와 B를 고른다.
(1 ≤ B ≤ A ≤ 500) 그 다음, 선영이는 상근이가 고른 수를 맞춰야 한다.
상근이는 선영이에게 다음과 같은 힌트를 주었다.

A의 제곱은 B의 제곱보다 N만큼 커 (1 ≤ N ≤ 1,000)
위의 힌트 조건을 만족하는 A와 B 쌍의 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다.

출력
상근이의 힌트 조건을 만족하는 (A,B) 쌍의 개수를 출력한다.

예제 입력 1
15
예제 출력 1
2
 */
import java.util.*;

public class Prac20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int x = 1; x * x <= n; x++) {
            if (n % x != 0) continue;

            int y = n / x;

            if((x + y) % 2 != 0) continue;
            if((y - x) % 2 != 0) continue;

            int A = (x + y) / 2;;
            int B = (y - x) / 2;

            if(A <= 500 && B >= 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
