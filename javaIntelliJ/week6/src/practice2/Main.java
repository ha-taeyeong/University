package practice2;

// main() 함수 포함
public class Main {
    public static void main(String[] args) {
        // 객체 생성
        MyInterface obj = new MyClass();

        // 추상 메서드 구현체 호출
        obj.doSomething();

        // 디폴트 메서드 호출
        obj.defaultMethod();

        // 정적 메서드는 클래스 이름으로 호출
        MyInterface.staticMethod();

        // 상수 접근
        System.out.println("인터페이스 상수: " + MyInterface.MAX);
    }
}
