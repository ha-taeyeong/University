package edu.hallym.week3_1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext();
        GradeService gradeService = context.getGradeService();

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        String grade = gradeService.getGrade(score);
        System.out.println("학점: " + grade);
    }

}
