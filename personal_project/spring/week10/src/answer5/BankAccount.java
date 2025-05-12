package answer5;

public class BankAccount {
    private int balance = 0; // 잔액

    public BankAccount() {
        this.balance = balance;
    }

    // 입급
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    // 출금
    public int withdraw(int amount) {
        try {
            if(balance >= amount) {
                balance -= amount;
            } else {
                throw new NegativeBalanceException("잔고가 음수입니다.");
            }
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("잔고 = " + balance);
        }
        return balance;
    }
}


