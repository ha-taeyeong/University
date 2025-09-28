package week4_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double score = 0; // 점수(실수형)
		double sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("점수 개수를 입력하세요(정수): ");
		int n = sc.nextInt(); // 점수 개수
		double[] scores = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + "번째 점수를 입력하세요: ");
			scores[i] = sc.nextDouble();
		}
		
		System.out.print("[" + name + "]" + "님 입력하신 점수 :");
        for (int i = 0; i < n; i++) {
            System.out.printf("[%.2f] ", scores[i]);
            sum += scores[i];
        }
        
        System.out.println();
        System.out.printf("총점은 [%.2f]\n", sum);
        avg = sum / n;
        System.out.printf("평균은 [%.2f]\n", avg);
		
		sc.close();
	}

}
