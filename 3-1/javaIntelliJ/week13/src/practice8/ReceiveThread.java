package practice8;

public class ReceiveThread extends Thread { // MessageBox에서 데이터를 꺼내는 소비자 역할
    private MessageBox dataBox;
    private int count; // ReceiveThread가 몇 번 데이터를 받아야 하는지를 결정하는 역할

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
