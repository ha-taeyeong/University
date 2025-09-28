package week4.concept7;

class Animal {
	
	String name;
	
	public Animal() { // 전역 멤버는 상속에서 제외된다.
		name = "UNKNOWN";
		System.out.println("동물입니다:" + name);
	}
	
	public Animal(String name) {
		this.name = name;
		System.out.println("동물입니다:" + name);
	}
	
}

