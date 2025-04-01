package week4.practice7;

class Animal {
	
	// 객체 선언
	private String name, sound;
	private int age;
	
	// 생성자
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.sound = "";
	}

	// getter, settter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Sound method
	public void bark() {}
	public void meow() {}
	public void chirp() {}
	
	// toString()
	@Override
	public String toString() {
		 return "이름은 " + name + ", 나이는 " + age + "살, 소리는 ";
	}
	
}
