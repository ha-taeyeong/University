package practice2;

class Add implements Calculator.Control {
    public void run(int a, int b) { // public 반드시 기재해야함
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}
