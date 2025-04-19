package week2.task.java6;

import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// 학생 수 입력
		System.out.print("학생수를 입력하세요:");
		int numStudents = input.nextInt();
		
		// 학생 배열 선언
		Student[] students = new Student[numStudents];
		
		// 학생 배열 값 넣기
		for(int i=0; i < numStudents; i++) {
			
			System.out.println("========" + (i+1) + "번째 학생 " + "정보 입력========");
			
			// 학생 이름 입력
			System.out.print("이름: ");
			String name = input.next();
			
			// 학생 나이 입력
			System.out.print("나이: ");
			int age = input.nextInt();
			
			System.out.println("======================================");
			
			// 성적 수 입력
			System.out.print((i+1)+"번째 학생의 성적 개수를 입력하세요:");
			int numScores = input.nextInt();
			
			// 성적 배열 선언
			int[] scores = new int[numScores];
			
			// 성적 배열 값 넣기
			for(int j=0; j < numScores; j++) {
				System.out.print((j+1)+"번째 성적: ");
				scores[j] = input.nextInt();
			}
			students[i] = new Student(name, age, scores);
		}
		
		System.out.println("=======전체 학생 정보 ========");
		for(Student student : students) {
			student.show(); 		// 전체 학생 정보 출력
			student.averageShow(); 	// 학생 평균 출력
		}
		input.close();
		
	}

}
