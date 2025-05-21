package example.thread.runnable;

public class ThreadExam3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int cnt = 0; cnt < 10; cnt++) {
                    System.out.print(cnt);
                }
            }
        });
        t1.start();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}
