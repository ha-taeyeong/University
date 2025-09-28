package week4.concept7;

class Lion extends Animal {
	public Lion() { 
		System.out.println("사자입니다."); 
	}
	
	public Lion(String name) { // 자식 객체 생성자
		super(name); // 부모 객체 생성자 전달 (항상 먼저)
		System.out.println("사자입니다.");
	}
}
