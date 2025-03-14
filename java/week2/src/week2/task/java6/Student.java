package week2.task.java6;

class Student {
	
	// 학생 이름, 나이, 점수 객체 선언
	private String name	;
	private int age		;
	private int score	;

	// 생성자
	public Student(String name, int age, int score) {
		this.name 	= name	;
		this.age 	= age	;
		this.score 	= score	;
	}
	
	// 학생 출력 메소드
	public void show() {
		System.out.println("이름: " + name + "\t나이: " + age + "\t점수: " + score);
	}
	
	// 성적 getter 메소드
    public int getScore() {
        return score;
    }

}
