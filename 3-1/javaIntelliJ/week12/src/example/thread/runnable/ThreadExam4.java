package example.thread.runnable;

public class ThreadExam4 {
    public static void main(String[] args) {
        Runnable rthread = new Runnable() { // 익명 구현 객체
            public void run() {
                for (int cnt = 0; cnt < 10; cnt++) {
                    System.out.print(cnt);
                }
            }
        };
        Thread t1 = new Thread(rthread);

        t1.start();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}
