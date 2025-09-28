package practice4;

public class Answer04 {
    public static void execute(Calculator cal, String ch) {
        int a = (int) (Math.random() * 20) + 1;
        int b = (int) (Math.random() * 5) + 1;
        System.out.print(a +"  "+ ch +"  "+  b +" => " );
        System.out.println(cal.run(a,b));
    }
    public static void main(String[] args) {
        //본인 작성
        execute(new Calculator() {
            public int run(int a, int b) {
                return a << b;
            }
        }, ">>");
        execute(new Calculator() {
            public int run(int a, int b) {
                return a << b;
            }
        }, "<<");
        execute(new Calculator() {
            public int run(int a, int b) {
                return a >> b;
            }
        }, "&");
        execute(new Calculator() {
            public int run(int a, int b) {
                return a ^ b;
            }
        }, "^");
    }
}
