package week4_3;

import java.util.List;

public class ScoreData {
	private String name;
	private List<Double> scores; // Wrapper 클래스
	
	public ScoreData() {}
	
	public ScoreData(String name, List<Double> scores) {
		this.name = name;
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getScores() {
		return scores;
	}

	public void setScores(List<Double> scores) {
		this.scores = scores;
	}
	
}
