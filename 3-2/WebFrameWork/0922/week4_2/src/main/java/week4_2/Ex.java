package week4_2;

import java.util.List;
import java.util.Scanner;

public class Ex implements ExInter{ // 객체적 프로그래밍 방식
	
	private String name;
	private List<Double> scores; // Wrapper 클래스
	private double sum, avg;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setScores(List<Double> scores) {
		this.scores = scores;
	}
	
	
	@Override
	public void process() {
		sum = 0.0;
		for (double d:scores)
			sum += d;
		
		avg = sum / scores.size();
	}
	
	@Override
	public void print() {
		System.out.print("[" + name + "]" + "님 입력하신 점수 :");
		for (double d:scores)
	        System.out.printf("[%.2f] ", d);
	    
	    System.out.println();
	    System.out.printf("총점은 [%.2f]\n", sum);
	    System.out.printf("평균은 [%.2f]\n", avg);
	}

}
