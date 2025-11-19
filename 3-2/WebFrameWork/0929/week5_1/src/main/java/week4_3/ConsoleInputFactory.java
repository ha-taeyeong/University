package week4_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInputFactory {
	public static ScoreData input() { // static을 사용하면 new() 연산자 없이 바로 사용가능
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("점수 개수를 입력하세요(정수): ");
		int n = sc.nextInt(); // 점수 개수
		
		List<Double> scores = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + "번째 점수를 입력하세요: ");
			double s = sc.nextDouble();
			scores.add(s);
		}
		return new ScoreData(name, scores);
	}
}
