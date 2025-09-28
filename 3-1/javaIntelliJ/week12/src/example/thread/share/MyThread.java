package example.thread.share;

class MyThread extends Thread {
    SharedResource sr;
    String srName;
    public MyThread(String srName, SharedResource sr) {
        this.srName = srName;
        this.sr = sr;
    }
    public void run() {
        for(int i=0; i<5; i++) {
            sr.changeShared(srName);
        }
    }
}
