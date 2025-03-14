package week2.task.java6;

class StudentManager {
	
	private Student[] students; // 학생 집합 객체
	private int count; // 배열의 크기
	
	public StudentManager(int size) {
		students = new Student[size];
		count = 0;
	}
	
	// 학생 추가 메소드
	public void addStudent(Student student) {
		if (count < students.length) {
			students[count++] = student;
		} else {
			System.out.println("더 이상 학생을 추가할 수 없습니다.");
		}
	}
	
	// 학생 평균값 출력 메소드
	public void avgStudent() {
		int sum = 0;
		int avg = 0;
		
		if (count == 0) {
			System.out.println("평균을 조회할 수 없습니다.");
		} else {
			for(int i=0; i<count; i++) {
				sum += students[i].getScore();
			}
			avg = sum / count;
			System.out.println("평균 점수 : " + avg);
		}
		
	}
	
	// 학생 전체 출력 메소드
	public void allshow() {
		if (count == 0) {
			System.out.println("평균을 조회할 수 없습니다.");
		} else {
			for (int i = 0; i < count; i++) {
				students[i].show();
	        }
		}
	}
}
