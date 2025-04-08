package com.kodilla.bank.homework;

public class Main {
    public static void main(String[] args) {
        CashMachine machine1 = new CashMachine(10);
        machine1.addTransaction(100);
        machine1.addTransaction(-50);

        CashMachine machine2 = new CashMachine(10);
        machine2.addTransaction(200);
        machine2.addTransaction(-75);

        CashMachine[] cashMachines = {machine1, machine2};
        Bank bank = new Bank(cashMachines);

        System.out.println("Total balance: " + bank.getTotalBalance());
        System.out.println("Number of payouts: " + bank.getWithdrawalsCount());
        System.out.println("Number of payments: " + bank.getDepositsCount());
        System.out.println("Average payout value: " + bank.getAverageWithdrawal());
        System.out.println("Average payment value: " + bank.getAverageDeposit());
    }
}