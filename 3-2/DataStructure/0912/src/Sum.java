import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		long n, sum = 0;
		long start, end, diff;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 값을 입력하시오 >> ");
		n = sc.nextInt();
		
		// 1 ~ n까지 합을 구하는 알고리즘. 첫번째 방법 상수시
		start = System.currentTimeMillis(); // 시작시간
		sum = n * (n + 1) / 2; // 등차수열(공차 1)
		end = System.currentTimeMillis(); // 종료시간
		diff = end - start;
		System.out.println("1. 시간복잡도 O(1)= " + diff);
		
		// 1 ~ n까지 합을 구하는 알고리즘. 두번째 방법 O(n)시간
		sum = 0;
		start = System.currentTimeMillis(); // 시작시간
		for(int i=1; i<=n; i++) {
			sum = sum +i;
		}
		end = System.currentTimeMillis(); // 종료시간
		diff = end - start;
		System.out.println("2. 시간복잡도 O(n)= " + diff);
		
		// 1 ~ n까지 합을 구하는 알고리즘. 번째 방법 O(n^2)시간
		sum = 0;
		start = System.currentTimeMillis(); // 시작시간
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				sum = sum + j;
			}
		}
		end = System.currentTimeMillis(); // 종료시간
		diff = end - start;
		System.out.println("3. 시간복잡도 O(n^2)= " + diff);
		
		sc.close();
		
	}
}
