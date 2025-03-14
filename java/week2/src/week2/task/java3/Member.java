package week2.task.java3;

class Member {
	// 1.현실 세계의 회원을 Member 클래스로 모델링하려고 합니다. 회원의 데이터로 이름, 아이디, 패스워드, 나이가 있습니다. 이 데이터들을 가지는 Member 클래스를 선언해 보세요
	private String name		;
	private String id		;
	private String password	;
	private int age			;
	
	// 2.디폴트 생성자 호출
	public Member() {}
	
	// 3.1에서 생성한 객체의 필드 값을 출력한 후 임의의 값으로 초기화하세요
	public void show() {
		System.out.println("name: " + name + "\nid: " + id + "\npassword: " + password + "\nage: " + age);
	}
	
	public void resetMember(String newName, String newId, String newPassword, int newAge) {
		this.name 		= newName	 	;
		this.id 		= newId		 	;
		this.password 	= newPassword	;
		this.age 		= newAge		;
	}
	
	// 4.이름, 아이디, 패스워드, 나이를 매개변수로 받아 필드로 초기화하는 생성자를 정의하세요
	public Member(String name, String id, String password, int age) {
		this.name 		= name		;
		this.id 		= id		;
		this.password 	= password	;
		this.age 		= age		;
	}
	
	
}
