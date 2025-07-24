package week5.ppt1;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        System.out.println(child == parent);
        parent.method1();
        parent.method2();
//        parent.method3(); // 호출 불가
    }
}
