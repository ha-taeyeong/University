package example.thread.priority;

public class PriorityExmaple {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            Thread thread = new CalcThread("thread" + i);

            if(i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}
