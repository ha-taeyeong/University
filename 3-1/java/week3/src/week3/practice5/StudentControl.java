package week3.practice5;

public class StudentControl {

	public static void searchGrade(Student[] students, char grade) {
		System.out.println("\n" + grade + " 등급 학생 목록:");
		
		for(Student student : students) {
			if (student.getGrade().charAt(0) == grade) { // getGrade().charAt(0) 문자열->문자 형변환하고, 첫번째 값을 반환
				System.out.println(student);
			}
		}
		
	}

	public static void searchScore(Student[] students, int score) {
		System.out.println("\n점수 " + score + "이상 학생 목록:");
		for(Student student : students) {
			if (student.getScore() >= score) {
				System.out.println(student);
			}
		}
	}
	
}
