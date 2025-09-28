package practice5;

public class Answer05 {
    public static void main(String[] args) {
        Calculator leftShift = (a,b) -> a << b;
        Calculator rightShift = (a,b) -> a >> b;
        Calculator and = (a,b) -> a & b;
        Calculator xor = (a,b) -> a ^ b;
        execute(leftShift, ">>");
        execute(rightShift, "<<");
        execute(and, "&");
        execute(xor, "^");
    }
    public static void execute(Calculator cal, String ch) {
        int a = (int) (Math.random() * 20) + 1;
        int b = (int) (Math.random() * 5) + 1;
        System.out.print(a +"  "+ ch +"  "+  b +" => " );
        System.out.println(cal.run(a,b));
    }
}
