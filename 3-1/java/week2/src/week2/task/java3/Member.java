package week2.task.java3;

/*
 * (3)	다음과 같은 문제를 해결하는 프로그램을 제시된 조건에 따라 해결하세요
	①	현실 세계의 회원을 Member 클래스로 모델링하려고 합니다. 회원의 데이터로 이름, 아이디, 패스워드, 나이가 있습니다. 이 데이터들을 가지는 Member 클래스를 선언해 보세요
	②	1번에서 작성한 클래스를 사용하여 객체를 생성하는 문장을 작성해 보세요. 단, 디폴트 생성자호출
	③	1에서 생성한 객체의 필드 값을 출력한 후 임의의 값으로 초기화하세요
	④	이름, 아이디, 패스워드, 나이를 매개변수로 받아 필드로 초기화하는 생성자를 정의하세요
	⑤	4번의 생성자를 사용하여 객체를 생성하는 문장을 작성해 보세요
	⑥	5번에서 생성된 객체의 필드값을 출력하는 문장을 작성해 보세요. 
 	feedback
 	3번 : 필드 멤버를 초기화하는 데이터를 생성자 매개변수로 받아 처리하여야 합니다
		즉 생성자가 오버로딩 되어 있어야 하며 
		오버로딩된 생성자를 사용하여 객체를 생성합니다
		멤버값 변경은 설정자 메소들 사용하시는 것이 좋습니다
 */
class Member {
	// 1.현실 세계의 회원을 Member 클래스로 모델링하려고 합니다. 회원의 데이터로 이름, 아이디, 패스워드, 나이가 있습니다. 이 데이터들을 가지는 Member 클래스를 선언해 보세요
	private String name		;
	private String id		;
	private String password	;
	private int age			;
	
	// 2.디폴트 생성자 호출 ( 필드 멤버를 초기화하는 데이터를 생성자 매개변수로 받아 처리하여야 합니다 )
	public Member() {
		this.name 		= null	;
		this.id 		= null	;
		this.password 	= null	;
		this.age 		= 0		;
	}
	
	// 4.이름, 아이디, 패스워드, 나이를 매개변수로 받아 필드로 초기화하는 생성자를 정의하세요
	// (오버로딩된 생성자를 사용하여 객체를 생성합니다)
	public Member(String name, String id, String password, int age) {
		this.name 		= name		;
		this.id 		= id		;
		this.password 	= password	;
		this.age 		= age		;
	}
	
	// 3.1에서 생성한 객체의 필드 값을 출력한 후 임의의 값으로 초기화하세요
	public void show() {
		System.out.println("name: " + name + "\nid: " + id + "\npassword: " + password + "\nage: " + age);
	}
	
	// 설정자 메소드
	public void setName (String name) {
		this.name = name;
	}
	
	public void setId (String id) {
		this.id = id;
	}
	
	public void setPassword (String password) {
		this.password = password;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
}
