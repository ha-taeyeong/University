package week2.test;

public class Info {

	// 객체 선언
	private String id;
	private int pass;
	
	// 생성자
	public Info(String id, int pass) {
		this.id  = id;
		this.pass= pass;
	}
	
	// 메소드
	public void show() {
		System.out.printf("id : %s, password : %d", id, pass);
	}
	
}
