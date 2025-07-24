package week2.test;

public class Member {
	
	private String name;
	private String id;
	private String pw;
	private int age;
	
	public Member(String name, String id, String pw, int age) {
		this.name=name;
		this.id=id;
		this.pw=pw;
		this.age=age;
	}
	
	public void show() {
		System.out.println("name: " + name);
	}
}
