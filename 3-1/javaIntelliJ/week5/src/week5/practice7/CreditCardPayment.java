package week5.practice7;

// 신용카드 결제 방식
public class CreditCardPayment extends Payment {
    // 메소드 재정의
    @Override
    public void processPayment(int amount) {
        System.out.println("신용카드 결제 완료: " + amount + "원");
    }
}
