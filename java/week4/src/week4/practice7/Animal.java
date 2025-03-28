package week4.practice7;

class Animal {
	
	private String name;	
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	// 공통 메소드
	public void eat() {
		System.out.println(name + " is eating");
	}

	public void sound() {}

}
