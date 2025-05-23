package backZoon;
/*
문제
동혁이는 졸업을 하기 위해 일반 화학 실험을 들어야 한다. 마지막 실험은 어떤 혼합물을 만든 뒤 온도를 1분에 한 번씩 잰 후, 1분동안 변화한 온도를 표로 만들어야 한다.

뛰어난 프로그래머인 동혁이는 혼합물의 온도를 자동으로 측정해주는 프로그램을 만들었다. 하지만, 깜빡하고 변화한 온도를 자동으로 계산해주는 프로그램을 만들지 않았다.

동혁이가 측정한 온도가 주어졌을 때, 변화한 온도를 구하는 프로그램을 작성하시오.

입력
입력은 동혁이가 측정한 혼합물의 온도가 순서대로 주어진다. 온도는 -10도와 200도 사이이고, 소수점 둘째자리까지 적혀져 있을 수도 있다. 마지막 측정 후에는 999가 주어진다. 동혁이는 온도를 적어도 2번 측정했다.

출력
입력으로 주어진 각 온도와 이전 온도와의 차이를 출력한다. 첫 번째 측정할 온도는 이전 온도가 없으니 출력할 필요가 없다. 차이는 항상 소수점 둘째자리까지 출력한다.
 */
import java.util.Scanner;

public class Prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] arr = new float[1000];
        int count = 0;

        while (true) {
            float temp = sc.nextFloat();
            if (temp == 999) {
                break;
            }
            arr[count++] = temp;
        }

        for (int i = 1; i < count; i++) {
            System.out.printf("%.2f\n", arr[i] - arr[i - 1]);
        }

        sc.close();
    }
}

