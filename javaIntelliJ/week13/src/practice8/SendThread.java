package practice8;

public class SendThread extends Thread {
    private MessageBox dataBox ;
    private String[] messages;

    public SendThread(MessageBox dataBox, String[] messages) {
        this.dataBox = dataBox;
        this.messages = messages;
    }

    @Override
    public void run() {
        for(String data : messages) {
            dataBox.setData(data);
        }
    }
}
