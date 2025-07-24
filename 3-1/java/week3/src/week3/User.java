package week3;

class User {

	private String name, tel;	// 인스턴스 멤버
	private int no;				// 인스턴스 멤버
	private static int count=0; 	// 정적 멤머(생성 순서)
	
	public User(String name, String tel) {
		this.name = name;
		this.tel  = tel;
		this.no   = ++count;
	}
	
	public static int getCount() {
		return count;
	}
	
	public void show() {
		System.out.printf("이름: %s, 연락처: %s, 접수번호: %d \t", name, tel, no);
	}
}
