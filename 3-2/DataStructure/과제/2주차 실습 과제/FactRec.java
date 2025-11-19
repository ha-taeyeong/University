import java.util.Scanner;

public class FactRec {
    // 팩토리얼 함수 (실행시간 측정 포함 X, 재귀만 담당)
    int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("n 값을 입력하시오 >> ");
        n = sc.nextInt();

        FactRec fr = new FactRec();
        
        // 실행시간 측정
        long start = System.currentTimeMillis();
        int result = fr.factorial(n);
        long end = System.currentTimeMillis();
        
        long diff = end - start;

        System.out.println(n + "! = " + result);
        System.out.println("실행시간 = " + diff + "ms");

        sc.close();
    }
}
