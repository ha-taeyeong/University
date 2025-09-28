package week3.practice5;

public class Test {

	public static void main(String[] args) {
		 // 1. 이름 없는 학생 객체 생성 후 점수 설정
		Student student1 = new Student("둘리");
		student1.setScore(85);

		// 2. 이름과 점수를 전달한 학생 객체 생성
		Student student2 = new Student("김철수", 92);

		// 3. 배열에 5명의 학생 저장
		Student[] students = { student1, student2, new Student("이영희", 76), new Student("박지훈", 89),
					new Student("최민수", 95) };

		// 4. 모든 학생 정보 출력
		System.out.println("\n=== 학생 목록 ===");
		for (Student student : students) {
			System.out.println(student);
		}

	// 5. 등급과 성적으로 학생 정보 출력
		StudentControl.searchGrade(students, 'B');
		StudentControl.searchScore(students, 86);
	}

}
