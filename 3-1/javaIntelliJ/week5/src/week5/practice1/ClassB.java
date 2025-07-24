package week5.practice1;

class ClassB extends ClassA {
    @Override
    public void methodOne(int i) { System.out.println("ClassB : B1"); } // 오버라이딩
    @Override
    public void methodTwo(int i) { System.out.println("ClassB : B2"); } // 오버라이딩

    public static void methodThree(int i) { System.out.println("ClassB : B3"); } // static 메소드 숨기기
    public static void methodFour(int i) { System.out.println("ClassB : B4"); } // static 메소드 숨기기
}
