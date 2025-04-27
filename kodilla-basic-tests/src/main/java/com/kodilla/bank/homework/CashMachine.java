package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int transactionCount = 0;

    public CashMachine(int capacity) {
        transactions = new double[capacity];
    }

    public void addTransaction(double amount) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount++] = amount;
        } else {
            System.out.println("No room for new transactions.");
        }
    }

    public double getBalance() {
        double balance = 0;
        for (int i = 0; i < transactionCount; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public int getDepositCount() {
        int depositCount = 0;
        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i] > 0) {
                depositCount++;
            }
        }
        return depositCount;
    }

    public int getWithdrawalCount() {
        int withdrawalCount = 0;
        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i] < 0) {
                withdrawalCount++;
            }
        }
        return withdrawalCount;
    }

    public double getAverageWithdrawal() {
        double sum = 0;
        int withdrawalCount = 0;
        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i] < 0) {
                sum += transactions[i];
                withdrawalCount++;
            }
        }
        return withdrawalCount == 0 ? 0 : sum / withdrawalCount;
    }

    public double getAverageDeposit() {
        double sum = 0;
        int depositCount = 0;
        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i] > 0) {
                sum += transactions[i];
                depositCount++;
            }
        }
        return depositCount == 0 ? 0 : sum / depositCount;
    }
}

