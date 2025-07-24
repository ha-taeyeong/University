package club;
import java.util.Scanner;

// 객체지향프로그래밍의 장점 : 재사용성, 생산성 향상, 자연성 모델링, 유지보수 우수
public class Calculate {

	public static void main(String[] args) {
		// A 학생과 B 학생 C 학생의 점수의 평균을 내는 프로그램을 만드시오.
		int a, b, c, sum, avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A 학생의 성적을 입력하세요 >>> ");
		a = sc.nextInt();
		System.out.print("B 학생의 성적을 입력하세요 >>> ");
		b = sc.nextInt();
		System.out.print("C 학생의 성적을 입력하세요 >>> ");
		c = sc.nextInt();
		
		sum = a + b + c;
		
		avg = sum / 3;
		
		// problem1. a학생이랑 b학생중 누가 더 점수가 높은지 대결
		if (a > b) {
			System.out.println("a win");
		} else if (b > a){
			System.out.println("b win");
		}
		// problem2. 평균보다 점수가 낮은 학생 검출하는 프로그램
		System.out.println("학생 평균 : " + avg);
		if (avg > a) {
			System.out.println("a detected");
		} else if (avg > b) {
			System.out.println("b detected");
		} else if (avg > c) {
			System.out.println("c detected");
		}
		
	}

}
