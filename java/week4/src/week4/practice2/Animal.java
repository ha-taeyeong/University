package week4.practice2;

//부모 클래스: Animal
class Animal {
	 String name;
	
	 // 생성자
	 public Animal(String name) {
	     this.name = name;
	 }
	
	 // 공통된 행동 (메소드)
	 public void makeSound() {
	     System.out.println("Some sound");
	 }
}