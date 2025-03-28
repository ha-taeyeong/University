package week4.practice7;

class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	@Override
    public void sound() {
        System.out.println("Cat says: 야옹");
    }

}
