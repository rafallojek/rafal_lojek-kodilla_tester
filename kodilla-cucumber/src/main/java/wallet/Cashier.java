package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount <= 0) {
            cashSlot.dispense(0);
            return;
        }

        if (wallet.getBalance() >= amount) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else {
            cashSlot.dispense(0);
        }
    }
}
