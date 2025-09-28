package practice2;

interface MyInterface {
    // 1. 상수
    int MAX = 100; // public static final이 생략됨

    // 2. 추상 메서드
    void doSomething(); // public abstract가 생략됨

    // 3. 디폴트 메서드 (Java 8+)
    default void defaultMethod() {
        System.out.println("디폴트 메서드입니다.");
    }

    // 4. 정적 메서드 (Java 8+)
    static void staticMethod() {
        System.out.println("정적 메서드입니다.");
    }

    // 5. private 메서드 (Java 9+)
    private void helper() {
        System.out.println("인터페이스 내부용 private 메서드입니다.");
    }
}

