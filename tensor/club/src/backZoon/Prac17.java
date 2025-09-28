package backZoon;
/*
입력
x2  + 2Ax + B = 0 의 두 계수 A, B가 주어진다. A, B는 정수이며, 이 방정식의 근은 항상 정수이다. (-1000 ≤ A, B ≤ 1000)

출력
첫 번째 줄에 방정식의 근들을 모두 공백으로 분리해 오름차순으로 출력한다. 중근일 경우 하나만 출력한다.

예제 입력 1
2 3
예제 출력 1
-3 -1
예제 입력 2
1 -8
예제 출력 2
-4 2
예제 입력 3
1 1
예제 출력 3
-1
 */
import java.util.*;

public class Prac17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int discriminant = A * A - B;

        int sqrtD = (int)Math.sqrt(discriminant);

        int x1 = -A + sqrtD;
        int x2 = -A - sqrtD;

        if (x1 == x2) {
            System.out.println(x1);
        } else if (x1 < x2) {
            System.out.println(x1 + " " + x2);
        } else {
            System.out.println(x2 + " " + x1);
        }
    }
}

