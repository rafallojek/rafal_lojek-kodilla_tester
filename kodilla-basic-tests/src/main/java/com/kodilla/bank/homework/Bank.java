package com.kodilla.bank.homework;

public class Bank {
    public CashMachine[] cashMachines;

    public Bank(int numberOfCashMachines) {
        cashMachines = new CashMachine[numberOfCashMachines];
        for (int i = 0; i < numberOfCashMachines; i++) {
            cashMachines[i] = new CashMachine(100);
        }
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getTotalWithdrawalCount() {
        int totalWithdrawals = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalWithdrawals += cashMachine.getWithdrawalCount();
        }
        return totalWithdrawals;
    }

    public int getTotalDepositCount() {
        int totalDeposits = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalDeposits += cashMachine.getDepositCount();
        }
        return totalDeposits;
    }

    public double getAverageWithdrawal() {
        double sum = 0;
        int totalWithdrawals = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.getAverageWithdrawal() * cashMachine.getWithdrawalCount();
            totalWithdrawals += cashMachine.getWithdrawalCount();
        }
        return totalWithdrawals == 0 ? 0 : sum / totalWithdrawals;
    }

    public double getAverageDeposit() {
        double sum = 0;
        int totalDeposits = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.getAverageDeposit() * cashMachine.getDepositCount();
            totalDeposits += cashMachine.getDepositCount();
        }
        return totalDeposits == 0 ? 0 : sum / totalDeposits;
    }
}
