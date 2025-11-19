package week4_3;

import java.util.List;

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
		for (double s:scores)
			sum += s;
		
		avg = scores.isEmpty() ? 0.0 : sum / scores.size();
	}
	
	@Override
	public void print() {
		System.out.printf("[%s]님 입력하신 점수 :", name);
		if(scores != null) {
			for (double s : scores) {
				System.out.printf("[%.2f] ", s);
			}
		}
		System.out.printf("\n총점은 [%.2f]\n평균은 [%.2f]\n", sum, avg);

	}

}
