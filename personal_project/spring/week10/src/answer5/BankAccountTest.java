package answer5;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        System.out.println("저축 100, 잔고 = " + bankAccount.deposit(100));
        System.out.println("저축 500, 잔고 = " + bankAccount.deposit(500));

        // try-catch 없이 바로 호출
        System.out.print("출금 800, ");
        bankAccount.withdraw(800); // 잔고 확인
    }
}
