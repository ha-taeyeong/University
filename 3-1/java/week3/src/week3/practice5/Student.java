package week3.practice5;

public class Student {
	// 학생은 이름(private name)과 점수(private score), 등급(private grade)을 가진다.
	private String name, grade;
	private int score;
	
	// 이름과 점수를 전달하는 생성자도 필요하다.
	public Student(String name) { // 점수, 등급 초기화
		this.name = name;
		this.score = 0;
		this.grade = "F";
	}
	public Student(String name, int score) { // 이름, 점수 입력 받음
		this.name = name;
		this.score = score;
		this.grade = calculateGrade(score);
	}
	
	// 점수를 변경하는 메소드와 등급과 점수를 반환하는 메소드도 필요하다.
	public String calculateGrade(int score) {
		switch (score / 10) {
			case 10: 	return "A";
			case 9:		return "A";
			case 8: 	return "B";
			case 7:		return "C";
			case 6:		return "D";
			default:	return "F";
		}
	}
	
	public void setScore(int score) {
		this.score = score;
		this.grade = calculateGrade(score);
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}

	// 객체 내용(이름, 점수, 등급)을 문자열로 반환하는 메소드 toString()를 가진다.
	@Override
	public String toString() {
		return "이름:" + name + ", 점수:" + score + ", 등급:" + grade;
	}

}
