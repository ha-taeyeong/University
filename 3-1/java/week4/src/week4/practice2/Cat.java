package week4.practice2;

// 자식 클래스: Cat
class Cat extends Animal {

    // 생성자
    public Cat(String name) {
        super(name);  // 부모 클래스 생성자 호출
    }

    // 메소드 오버라이드: 고양이는 '야옹' 소리를 냅니다.
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}