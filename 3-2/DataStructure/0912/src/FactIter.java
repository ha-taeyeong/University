import java.util.Scanner;

public class FactIter {
	public static void main(String[] args) {
        int n = 0;
        long start, end, diff;

        Scanner sc = new Scanner(System.in);
        System.out.print("n 값을 입력하시오 >> ");
        n = sc.nextInt();

        System.out.print("First " + n + " terms: ");
        start = System.currentTimeMillis(); // 시작시간

        long factorial = 1; // 팩토리얼 값 저장 (int 범위 초과 고려해 long 사용)
        for (int i = 1; i <= n; ++i) {
            factorial *= i; // i까지의 팩토리얼 계산
            System.out.print(factorial + " ");
        }

        System.out.println();
        end = System.currentTimeMillis(); // 종료시간
        diff = end - start;
        System.out.println("실행시간= " + diff + "ms");

        sc.close();
    }
}
