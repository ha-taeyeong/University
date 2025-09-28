package example.thread.inheritance;

public class ThreadEx_01 {
    public static void main(String[] args) {
        Thread thread = new DigitThread();
        thread.start();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
