package practice7;

public class Job extends Thread {
    // 필드
    private String name;
    private int num = 0;

    // 생성자
    public Job(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int value = getNum();
            System.out.println(name + ": " + value);
            if (value >= 9) break;
        }
    }

    public synchronized int getNum() {
        num++;
        return num;
    }
}
