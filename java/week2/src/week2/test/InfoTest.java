package week2.test;

import java.util.Scanner;

public class InfoTest {

	public static void main(String[] args) {
		
		// 아이디 입력 받는 함수
		Scanner input = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요.");
		String id = input.next();
		
		// 비밀번호 난수 함수
		int pass = (int)(Math.random()*100)+1;
		
		// 클래스 객체 생성
		Info info = new Info(id, pass);
		
		info.show();
	}

}
