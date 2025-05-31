package practice8;

public class WaitNofifyExam {
    public static void main(String[] args) {
        MessageBox dataBox = new MessageBox();
        String[] message = new String[] { "hallym", "big data", "software", "AI" };

        SendThread sendThread = new SendThread(dataBox, message);
        ReceiveThread receiveThread = new ReceiveThread(dataBox, message.length);

        sendThread.start();
        receiveThread.start();
    }
}
