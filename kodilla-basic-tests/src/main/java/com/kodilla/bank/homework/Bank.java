package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (CashMachine machine : cashMachines) {
            totalBalance += machine.getBalance();
        }
        return totalBalance;
    }

    public int getWithdrawalsCount() {
        int withdrawalsCount = 0;
        for (CashMachine machine : cashMachines) {
            double[] transactions = machine.getTransactions();
            for (double transaction : transactions) {
                if (transaction < 0) {
                    withdrawalsCount++;
                }
            }
        }
        return withdrawalsCount;
    }

    public int getDepositsCount() {
        int depositsCount = 0;
        for (CashMachine machine : cashMachines) {
            double[] transactions = machine.getTransactions();
            for (double transaction : transactions) {
                if (transaction > 0) {
                    depositsCount++;
                }
            }
        }
        return depositsCount;
    }

    public double getAverageWithdrawal() {
        double totalWithdrawal = 0;
        int withdrawalsCount = getWithdrawalsCount();
        if (withdrawalsCount == 0) {
            return 0;
        }
        for (CashMachine machine : cashMachines) {
            double[] transactions = machine.getTransactions();
            for (double transaction : transactions) {
                if (transaction < 0) {
                    totalWithdrawal += Math.abs(transaction);
                }
            }
        }
        return totalWithdrawal / withdrawalsCount;
    }

    public double getAverageDeposit() {
        double totalDeposit = 0;
        int depositsCount = getDepositsCount();
        if (depositsCount == 0) {
            return 0;
        }
        for (CashMachine machine : cashMachines) {
            double[] transactions = machine.getTransactions();
            for (double transaction : transactions) {
                if (transaction > 0) {
                    totalDeposit += transaction;
                }
            }
        }
        return totalDeposit / depositsCount;
    }
}