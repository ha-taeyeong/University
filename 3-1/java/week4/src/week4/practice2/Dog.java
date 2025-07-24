package week4.practice2;

//자식 클래스: Dog
class Dog extends Animal {

	 // 생성자
	 public Dog(String name) {
	     super(name);  // 부모 클래스 생성자 호출
	 }
	
	 // 메소드 오버라이드: 개는 '멍멍' 소리를 냅니다.
	 @Override
	 public void makeSound() {
	     System.out.println(name + " says: Woof!");
	 }
}