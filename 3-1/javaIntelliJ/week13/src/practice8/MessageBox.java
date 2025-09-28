package practice8;

public class MessageBox { // 데이터를 임시로 저장하는 공유 객체
    private String data;

    public synchronized String getData() {
        while (this.data == null) { // 데이터가 없으면 대기
            try { wait(); } catch (InterruptedException e) {}
        }
        String returnValue = data; // 데이터 가져오기
        System.out.println("ReceiveThread 스레드가 수신한 데이터: " + returnValue);
        data = null; // 데이터 초기화
        notify(); // 대기중인 스레드 깨우기
        return returnValue;
    }
    public synchronized void setData(String data) {
        while (this.data != null) { // 데이터가 있으면 대기
            try { wait(); } catch (InterruptedException e) {}
        }
        this.data = data; // 데이터 저장하기
        System.out.println("SendThread 스레드가 전송한 데이터: " + data);
        notify();
    }
}
