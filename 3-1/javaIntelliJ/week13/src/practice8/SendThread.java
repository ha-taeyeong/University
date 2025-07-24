package practice8;

public class SendThread extends Thread { // 데이터를 MessageBox에 순차적으로 넣는 생산자 역할
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
