package com.kodilla.bank.homework;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(2);


        bank.cashMachines[0].addTransaction(100);
        bank.cashMachines[0].addTransaction(-50);
        bank.cashMachines[1].addTransaction(200);
        bank.cashMachines[1].addTransaction(-100);

        System.out.println("Total bank balance sheet: " + bank.getTotalBalance());
        System.out.println("Number of withdrawal transactions: " + bank.getTotalWithdrawalCount());
        System.out.println("Number of deposit transactions: " + bank.getTotalDepositCount());
        System.out.println("Average payout value: " + bank.getAverageWithdrawal());
        System.out.println("Average value of payments: " + bank.getAverageDeposit());
    }
}
