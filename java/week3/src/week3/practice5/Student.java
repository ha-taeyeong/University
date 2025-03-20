package week3.practice5;

public class Student {
	private String name, grade;
	private int score;
	
	public Student(String name, String grade, int score) {
		this.name = name;
		this.grade = grade;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "이름=" + name + ", 점수=" + score +", 등급=" + grade;
	}
	
}
