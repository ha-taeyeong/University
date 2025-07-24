package week2.test;

import java.util.Scanner;

// 1개의 파일에 2개의 클래스가 있는 경우 public은 1번만 사용해야 한다.
class InfoT {
	
	private String id;
	private int pass;
	
	// 생성자는 누구든지 접근가능해야하므로 public
	public InfoT(String id) {
		this.id = id; // 필드 앞에 this를 붙여준다.(필드와 매개변수를 구분하기 위해서)
		pass = password();
	}
	
	// 메소드
	public String toString() {
		return "id="+id+"\tpass="+pass;
	}
	
	public void changePass() {
		pass = password();
	}
	
	private int password() {
		return (int)(Math.random()*9000)+1000;
	}
}
public class InfoTestT {
	// 코드 실행 순서는 메인 영역만 위에서 아래 순서이고, 클래스는 호출하면 실행되는 형식이다.
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in); 
		InfoT info1=null; // 참조 변수 같은 경우는 null값으로 초기화 해주어야 오류 발생하지 않는다.
		
		System.out.print("id input >> ");
		String id = key.next(); // 아이디를 입력받는 변수
		info1 = new InfoT(id);
		System.out.println(info1); // toString()은 오버라이딩이 되어있다(생략 가능)
		
		info1.changePass();
		
		System.out.println("=======================");
		System.out.println(info1);
		
		key.close(); // Scanner를 닫아주는 의미
		
	}

}
