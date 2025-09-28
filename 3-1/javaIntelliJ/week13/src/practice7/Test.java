package practice7;

public class Test{
    public static void main(String[] args) {
        Thread t1 = new Job("ThreadA");
        Thread t2 = new Job("ThreadB");
        t1.start();
        t2.start();
    }
}
