package week5.practice7;

// 페이팔 결제 방식
public class PaypalPayment extends Payment {
    // 메소드 재정의
    @Override
    public void processPayment(int amount) {
        System.out.println("페이팔 결제 완료: " + amount + "원");
    }
}
