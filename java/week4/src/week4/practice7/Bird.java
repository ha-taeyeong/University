package week4.practice7;

class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}
	
	@Override
    public void sound() {
        System.out.println("Bird says: 짹짹");
    }
	
}
