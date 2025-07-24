package week5.practice7;

public class Main {
    // 피드백 수정
    public static void main(String[] args) {
        // 객체 배열
        // CreditCardPayment:신용카드 결제, GooglePayPayment:구글결제, PaypalPayment : 페이팔 결제
        Payment[] payments = {new CreditCardPayment(), new PaypalPayment(), new GooglePayPayment()};

        // 가격 배열
        int[] amount = {10000, 5000, 2000};

        // 배열 삽입
        for(int i = 0; i < payments.length; i++) {
            payments[i].processPayment(amount[i]);
        }
    }
}
