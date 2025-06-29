package wallet;

public class Wallet {
    private int balance = 0;

    public void deposit(int money) {
        if (money > 0) {
            this.balance += money;
        }
    }

    public void debit(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
