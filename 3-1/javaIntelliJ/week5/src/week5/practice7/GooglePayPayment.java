package week5.practice7;

// 구글 결제 방식
public class GooglePayPayment extends Payment {
    // 메소드 재정의
    @Override
    public void processPayment(int amount) {
        System.out.println("구글 페이 결제 완료: " + amount + "원");
    }
}
