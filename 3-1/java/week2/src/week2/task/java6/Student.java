package week2.task.java6;

/*
 * 학생의 성적을 관리하는 프로그램을 작성하세요.
 * 이 프로그램에서는 학생 클래스(Student)를 정의하고, 각 학생의 이름, 나이, 성적 등을 속성으로 가지며, 성적 평균을 계산하는 메서드를 포함해야 합니다.
 * 여러 명의 학생 데이터를 처리할 수 있도록 배열로 학생 객체를 관리해야 하며, 최종적으로 전체 학생 정보와 전체 성적 평균을 출력합니다.
 * 
 * feedback
 * 6번 : 성적 평균을 계산하는 메소드가 멤버로 포함되어 있지 않습니다
    그리고 성적은 평균을 계산하려면 적어도 2개 이상은 있어야 겠지요
 */
class Student {
	
	// 학생 이름, 나이, 점수 객체 선언
	private String name	;
	private int age		;
	private int[] scores;

	// 생성자
	public Student(String name, int age, int[] scores) {
		this.name 	= name	;
		this.age 	= age	;
		this.scores = scores;
	}
	
	// 성적 평균 메소드
	public int average() {
		if(scores.length == 0) {
			return 0;
		}
		int total = 0;
		
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		return total / scores.length;
	}
	
	// 성적 평균출력 메소드
    public void averageShow() {
    	int avarage = average();
        System.out.println("전체 성적 평균: " + avarage);
        System.out.println();
    }
    
    // 학생 출력 메소드
 	public void show() {
 		System.out.print("이름: " + name + ",\t나이: " + age + ",\t성적: ");
 		for(int i=0; i < scores.length; i++) {
 			if(i == 0) {
 				System.out.print(scores[i] + "점["+(i+1)+"번째]");
 			} else {
 				System.out.print(", "+ scores[i] + "점["+(i+1)+"번째]");
 			}
 		}
 		System.out.println();
 	}
 	

}
