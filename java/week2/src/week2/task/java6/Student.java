package week2.task.java6;

/*
 * 학생의 성적을 관리하는 프로그램을 작성하세요.
 * 이 프로그램에서는 학생 클래스(Student)를 정의하고, 각 학생의 이름, 나이, 성적 등을 속성으로 가지며, 성적 평균을 계산하는 메서드를 포함해야 합니다.
 * 여러 명의 학생 데이터를 처리할 수 있도록 배열로 학생 객체를 관리해야 하며, 최종적으로 전체 학생 정보와 전체 성적 평균을 출력합니다.
 */
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
