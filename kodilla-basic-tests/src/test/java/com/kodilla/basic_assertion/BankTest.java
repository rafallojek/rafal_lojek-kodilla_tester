import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    void testEmptyBank() {
        CashMachine[] cashMachines = new CashMachine[0];
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getWithdrawalsCount());
        assertEquals(0, bank.getDepositsCount());
        assertEquals(0, bank.getAverageWithdrawal());
        assertEquals(0, bank.getAverageDeposit());
    }

    @Test
    void testSingleMachineWithDeposit() {
        CashMachine machine = new CashMachine(10);
        machine.addTransaction(100);
        CashMachine[] cashMachines = {machine};
        Bank bank = new Bank(cashMachines);
        assertEquals(100, bank.getTotalBalance());
        assertEquals(0, bank.getWithdrawalsCount());
        assertEquals(1, bank.getDepositsCount());
        assertEquals(0, bank.getAverageWithdrawal());
        assertEquals(100, bank.getAverageDeposit());
    }

    @Test
    void testSingleMachineWithWithdrawal() {
        CashMachine machine = new CashMachine(10);
        machine.addTransaction(-50);
        CashMachine[] cashMachines = {machine};
        Bank bank = new Bank(cashMachines);
        assertEquals(-50, bank.getTotalBalance());
        assertEquals(1, bank.getWithdrawalsCount());
        assertEquals(0, bank.getDepositsCount());
        assertEquals(50, bank.getAverageWithdrawal());
        assertEquals(0, bank.getAverageDeposit());
    }

    @Test
    void testMultipleMachines() {
        CashMachine machine1 = new CashMachine(10);
        machine1.addTransaction(100);
        machine1.addTransaction(-50);

        CashMachine machine2 = new CashMachine(10);
        machine2.addTransaction(200);
        machine2.addTransaction(-75);

        CashMachine[] cashMachines = {machine1, machine2};
        Bank bank = new Bank(cashMachines);
        assertEquals(175, bank.getTotalBalance());
        assertEquals(2, bank.getWithdrawalsCount());
        assertEquals(2, bank.getDepositsCount());
        assertEquals(62.5, bank.getAverageWithdrawal(), 0.1);
        assertEquals(150, bank.getAverageDeposit(), 0.1);
    }

    @Test
    void testMultipleWithdrawals() {
        CashMachine machine = new CashMachine(10);
        machine.addTransaction(-50);
        machine.addTransaction(-75);
        CashMachine[] cashMachines = {machine};
        Bank bank = new Bank(cashMachines);
        assertEquals(-125, bank.getTotalBalance());
        assertEquals(2, bank.getWithdrawalsCount());
        assertEquals(0, bank.getDepositsCount());
        assertEquals(62.5, bank.getAverageWithdrawal(), 0.1);
        assertEquals(0, bank.getAverageDeposit());
    }

    @Test
    void testMultipleDeposits() {
        CashMachine machine = new CashMachine(10);
        machine.addTransaction(100);
        machine.addTransaction(200);
        CashMachine[] cashMachines = {machine};
        Bank bank = new Bank(cashMachines);
        assertEquals(300, bank.getTotalBalance());
        assertEquals(0, bank.getWithdrawalsCount());
        assertEquals(2, bank.getDepositsCount());
        assertEquals(0, bank.getAverageWithdrawal());
        assertEquals(150, bank.getAverageDeposit(), 0.1);
    }

    @Test
    void testNoTransactions() {
        CashMachine machine = new CashMachine(10);
        CashMachine[] cashMachines = {machine};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getWithdrawalsCount());
        assertEquals(0, bank.getDepositsCount());
        assertEquals(0, bank.getAverageWithdrawal());
        assertEquals(0, bank.getAverageDeposit());
    }
}
