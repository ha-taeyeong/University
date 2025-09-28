package week5.concept12;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();

        System.out.println("a.val = " + a.val);
        System.out.println("b.val = " + b.val);
        System.out.println("ab.val = " + ab.val);

        System.out.print("\n a.f(a)="); a.f(a);
        System.out.print("\n a.f(b)="); a.f(b);

        System.out.print("\n b.f(a)="); b.f(a);
        System.out.print("\n b.f(b)="); b.f(b);

        System.out.print("\n a.f(ab)="); a.f(ab);
        System.out.print("\n b.f(ab)="); b.f(ab);

        System.out.print("\n ab.f(a)="); ab.f(a);
        System.out.print("\n ab.f(b)="); ab.f(b);
        System.out.print("\n ab.f(ab)="); ab.f(ab);
    }
}
