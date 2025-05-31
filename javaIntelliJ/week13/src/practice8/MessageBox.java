package practice8;

public class MessageBox {
    private String data;

    public synchronized String getData() {
        while (this.data == null) { // 데이터가 없으면 대기
            try { wait(); } catch (InterruptedException e) {}
        }
        String returnValue = data;
        System.out.println("ReceiveThread 스레드가 수신한 데이터: " + returnValue);
        data = null;
        notify();
        return returnValue;
    }
    public synchronized void setData(String data) {
        while (this.data != null) { // 데이터가 있으면 대기
            try { wait(); } catch (InterruptedException e) {}
        }
        this.data = data;
        System.out.println("SendThread 스레드가 전송한 데이터: " + data);
        notify();
    }
}
