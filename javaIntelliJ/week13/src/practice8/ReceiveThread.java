package practice8;

public class ReceiveThread extends Thread {
    private MessageBox dataBox;
    private int count;

    public ReceiveThread(MessageBox dataBox, int count) {
        this.dataBox = dataBox;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i <= count; i++) {
            dataBox.getData();
        }
    }
}
