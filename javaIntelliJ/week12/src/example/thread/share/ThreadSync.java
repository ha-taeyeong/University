package example.thread.share;

public class ThreadSync {
    public static void main(String[] args) {
        SharedResource res = new SharedResource();
        MyThread my_thread1 = new MyThread("thd1", res);
        MyThread my_thread2 = new MyThread("thd2", res);
        MyThread my_thread3 = new MyThread("thd3", res);
        my_thread1.start();
        my_thread2.start();
        my_thread3.start();
    }
}
