package week2.test;

/*
개인 연락처 관리 프로그램 작성
클래스 설계
 >> 속성(필드) : 이름, 연락처, 나이
    동작 : 검색, 출력

실행용-main()메소드
라이브러리-객체 생성 목적만
*/

class Contact {

	// 필드
	// String name; // package까지 공개 허용
	// 객체 초기화
	private String name; // private 외부에 공개 X
	private String phoneNumber;
	private int age;
	
	// 설정자 메소드:객체가 외부에 공개하지 않고, 값을 변경해야할 때 사용
	public void setAge(int age) {
		this.age=age;
	}
	// 접근자 메소드:객체가 외부에 공개하지 않고, 값을 불러올 때 사용
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// 생성자:한번만 호출, 생성자는 void를 사용하지 않는다. 싱글톤인 경우 private
	// 오버로딩 : 같은 이름, 타입의 메소드를 여러개 생성, 매개변수로 구분 가능, 
	public Contact() { // 오버로딩 상태에서는 자동으로 추가되지 않는다.
		this(null, null, 0); // 같은 클래스에서 오버로딩된 생성자를 사용할 때 this 활용
	}
	
	public Contact(String name) {
		this(name, null, 0); // 같은 클래스에서 오버로딩된 생성자를 사용할 때 this 활용
	}
	
	public Contact(String name, String phoneNumber) {
		this(name, phoneNumber, 0); // this는 실행문에서 첫 문장이여야한다.
	}
	
	public Contact(String name, String phoneNumber, int age) {
		this.name=name; // this.name 객체가 가지고 있는 필드, name:매개변수, this를 사용하는 이유:코드가독성
		this.phoneNumber=phoneNumber;
		this.age=age;
	}
	
	// 메소드
	// 반환값 유무, 매개변수 유무
	public void show() { // 전달하는 값이 없는 경우 void
		System.out.print("name: " + name + " phoneNumber: " + phoneNumber + " age: " + age);
		
	}
	
	boolean search(String name) { // 외부로 받는 값을 매개변수라고 한다. 매개변수를 사용할 것인지 판단 먼저, 전달하는 값이 있으면 타입설정
		return this.name.equals(name);
	}
	
	boolean search(int age) { // 외부로 받는 값을 매개변수라고 한다. 매개변수를 사용할 것인지 판단 먼저, 전달하는 값이 있으면 타입설정
		return this.age == age;
	}
	
}
