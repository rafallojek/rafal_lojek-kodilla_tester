package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int transactionIndex;

    public CashMachine(int maxTransactions) {
        this.transactions = new double[maxTransactions];
        this.transactionIndex = 0;
    }

    public void addTransaction(double amount) {
        if (transactionIndex < transactions.length) {
            transactions[transactionIndex] = amount;
            transactionIndex++;
        } else {
            System.out.println("Brak miejsca na nową transakcję.");
        }
    }

    public double getBalance() {
        double balance = 0;
        for (int i = 0; i < transactionIndex; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    public int getTransactionsCount() {
        return transactionIndex;
    }

    public double[] getTransactions() {
        double[] temp = new double[transactionIndex];
        System.arraycopy(transactions, 0, temp, 0, transactionIndex);
        return temp;
    }
}