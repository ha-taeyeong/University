package week5.practice1;

public class Test {
    public static void main(String args[]) {
        ClassA aa = new ClassA();
        ClassB bb = new ClassB();
        ClassA ab = new ClassB();

        ClassB.methodFour(0);  // ClassB : B4
        ClassA.methodFour(0);  // ClassA : A4
        aa.methodTwo(0);       // ClassA : A2
        bb.methodTwo(0);       // ClassB : B2
        ab.methodTwo(0);       // ClassB : B2
    }
}