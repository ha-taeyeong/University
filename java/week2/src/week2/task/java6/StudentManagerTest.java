package week2.task.java6;

import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		
		int size = 5; // 최대 학생 수:5명
		
		StudentManager manager = new StudentManager(size);
		
		Scanner sc = new Scanner(System.in); // 입력 함수
		
		for(int i=0; i < size; i++) {
			System.out.print("학생 이름: ");
			String name = sc.next();
			
			System.out.print("학생 나이: ");
			int age = sc.nextInt();

			System.out.print("학생 점수: ");
			int score = sc.nextInt();

			manager.addStudent(new Student(name, age, score));
		}
		if(size == 5) {
			System.out.println("학생 정보가 모두 입력되었습니다.");
		}
		
		manager.allshow(); 		// 전체출력 메소드 호출
		manager.avgStudent(); 	// 평균점수 출력 메소드 호출
		sc.close();				// 입력 함수 닫기
		
	}

}
