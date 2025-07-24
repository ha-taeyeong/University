package practice4;

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                String[] strs = {"◆", "▣", "※", "○", "♠", "★", "♣"};
                for (int i = 0; i < strs.length; i++) {
                    System.out.println("특수문자 : " + strs[i]);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    int[] nums = {1, 2, 3, 4, 5};
                    for (int i = 0; i < nums.length; i++) {
                        System.out.println("숫자 : " + nums[i]);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String[] strs = {"F", "G", "H", "I", "J", "K"};
                    for (int i = 0; i < strs.length; i++) {
                        System.out.println("영문자 : " + strs[i]);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

    }
}
