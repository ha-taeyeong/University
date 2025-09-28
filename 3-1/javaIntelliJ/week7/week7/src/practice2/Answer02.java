package practice2;

public class Answer02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("----- Add -----");
        cal.setControl(new Add());
        cal.compute((int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
        System.out.println("----- Exp -----");
        cal.setControl(new Exp());
        cal.compute(5, 3);
    }
}
