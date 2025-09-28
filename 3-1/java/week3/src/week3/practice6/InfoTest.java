package week3.practice6;

import java.util.Scanner;

public class InfoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 첫 번째 아이디 입력 및 객체 생성
		System.out.print("아이디를 입력 하세요 >>> ");
		String id1 = sc.next();
		Info info1 = new Info(id1);
		System.out.println("첫번째 객체 생성 완료");	
		
		// 두 번째 아이디 입력 및 객체 생성
		System.out.print("아이디를 입력 하세요 >>> ");
		String id2 = sc.next();
		Info info2 = new Info(id2);
		System.out.println("두번째 객체 생성 완료");
		
		System.out.println("\n첫번째 객체의 아이디와 비밀번호 출력");
		System.out.println(info1);
		System.out.println("\n두번째 객체의 아이디와 비밀번호 출력");
		System.out.println(info2);
		
		info1.setPass();
		
		System.out.println("\n첫 번째 객체의 비밀번호 변경 후 출력");
		System.out.println(info1);
		
		sc.close();
		
	}
	
}
