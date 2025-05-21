package example.thread.runnable;

// Runnable 인터페이스를 구현하는 클래스
class ThreadImp implements Runnable {
    public void run() {
        for (int cnt = 0; cnt < 10; cnt++) {
            System.out.print(cnt);
        }
    }
}
