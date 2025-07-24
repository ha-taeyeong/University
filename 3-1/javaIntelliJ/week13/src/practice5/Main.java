package practice5;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new IntThread();
        Runnable r = new StringThread();
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
