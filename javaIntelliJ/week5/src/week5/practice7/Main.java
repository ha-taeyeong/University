package week5.practice7;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment(); // 신용카드 결제
        Payment paypalPayment = new PaypalPayment();         // 페이팔 결제
        Payment googlePayPayment = new GooglePayPayment();   // 구글 결제

        PaymentProcessor paymentProcessor1 = new PaymentProcessor(creditCardPayment);
        PaymentProcessor paymentProcessor2 = new PaymentProcessor(paypalPayment);
        PaymentProcessor paymentProcessor3 = new PaymentProcessor(googlePayPayment);

        paymentProcessor1.process(10000);
        paymentProcessor2.process(5000);
        paymentProcessor3.process(2000);
    }
}
