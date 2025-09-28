import java.util.Scanner;

public class FibIter {
	public static void main(String[] args) {
		
		int n = 0, t1 = 0, t2 = 1;
		long start, end, diff;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 값을 입력하시오 >> ");
		n = sc.nextInt();
		
		System.out.print("First " + n + " terms: ");
		start = System.currentTimeMillis(); // 시작시간
		for (int i = 1; i <= n; ++i) {
			System.out.print(t1);
		    if (i != n) { // 마지막 항이 아니면
		        System.out.print(" + ");
		    }
			int sum = t1 + t2; // 전전항 + 전항
			t1 = t2; // 전전항=전항
			t2 = sum; // 전항=sum
		}
		System.out.println();
		end = System.currentTimeMillis(); // 종료시간
		diff = end - start;
		System.out.println("실행시간= " + diff);
		
		sc.close();
	}
}
