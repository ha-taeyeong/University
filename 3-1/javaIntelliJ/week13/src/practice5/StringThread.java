package practice5;

class StringThread implements Runnable {
    @Override
    public void run() {
        String[] strArray = {"hallym", "software", "big", "content", "IoT", "data"};
        try {
            for (int i = 0; i < strArray.length; i++) {
                System.out.println("string-thread : " + strArray[i]);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
