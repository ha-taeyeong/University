package week5.practice7;

// 결제 과정 클래스
public class PaymentProcessor {
    // 변수 선언
    private Payment paymentMethod; // 결제 처리 방식

    // 생성자
    public PaymentProcessor(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // 메소드
    public void process(int amount) {
        paymentMethod.processPayment(amount);
    }
}
