package practice2;

class MyClass implements MyInterface {
    // 추상 메서드 반드시 구현해야 함
    public void doSomething() {
        System.out.println("doSomething()을 구현했습니다.");
    }

    // defaultMethod(), staticMethod()는 선택 구현 or 직접 호출
}

