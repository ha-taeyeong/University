package week4_2;

import java.util.Scanner;

public class Main2 { // 객체적 프로그래밍 방식
	
	int n = 0;
	String name;
	double[] scores;
	double sum = 0;
	double avg = 0;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		System.out.print("점수 개수를 입력하세요(정수): ");
		n = sc.nextInt(); // 점수 개수
		scores = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + "번째 점수를 입력하세요: ");
			scores[i] = sc.nextDouble();
		}
		sc.close();
	}
	
	public void process() {
		sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scores[i];
		}
		avg = sum / n;
	}
	
	public void print() {
		System.out.print("[" + name + "]" + "님 입력하신 점수 :");
	    for (int i = 0; i < n; i++) {
	        System.out.printf("[%.2f] ", scores[i]);
	    }
	    
	    System.out.println();
	    System.out.printf("총점은 [%.2f]\n", sum);
	    System.out.printf("평균은 [%.2f]\n", avg);
	}
	
	
	public static void main(String[] args) {
		Main2 k = new Main2();
		
		k.input();
		k.process();
		k.print();
	}

}
