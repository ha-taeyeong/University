package example.thread.runnable;

public class ThreadExam2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int cnt = 0; cnt < 10; cnt++) {
                System.out.print(cnt);
            }
        });
        thread.start();
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}
