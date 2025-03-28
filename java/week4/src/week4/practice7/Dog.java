package week4.practice7;

class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
		
	}

	@Override
    public void sound() {
        System.out.println("Dog says: 멍멍");
    }
}
