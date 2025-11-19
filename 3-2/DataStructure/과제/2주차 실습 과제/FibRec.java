import java.util.Scanner;

public class FibRec {
	
	public static int Fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		int n = 0;
		long start, end, diff;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 값을 입력하시오 >> ");
		n = sc.nextInt();
		
		start = System.currentTimeMillis(); // 시작시간
		int result = Fibonacci(n);
		end = System.currentTimeMillis(); // 종료시간
		diff = end - start;
		
		System.out.println("Fibonacci(" + n + ") = " + result);
		System.out.println("실행시간= " + diff + "ms");
		
		sc.close();
		
	}
}
