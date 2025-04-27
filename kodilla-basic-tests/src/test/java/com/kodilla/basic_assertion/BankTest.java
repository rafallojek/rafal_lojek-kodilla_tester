package com.kodilla.basic_assertion;

import com.kodilla.bank.homework.Bank;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank(2);  // Tworzymy bank z dwoma bankomatami
    }

    @Test
    public void testTotalBalance() {
        bank.cashMachines[0].addTransaction(100);
        bank.cashMachines[0].addTransaction(-50);
        bank.cashMachines[1].addTransaction(200);
        bank.cashMachines[1].addTransaction(-100);

        assertEquals(150, bank.getTotalBalance(), 0.001);
    }

    @Test
    public void testTotalWithdrawals() {
        bank.cashMachines[0].addTransaction(-50);
        bank.cashMachines[1].addTransaction(-100);

        assertEquals(2, bank.getTotalWithdrawalCount());
    }

    @Test
    public void testTotalDeposits() {
        bank.cashMachines[0].addTransaction(100);
        bank.cashMachines[1].addTransaction(200);

        assertEquals(2, bank.getTotalDepositCount());
    }

    @Test
    public void testAverageWithdrawal() {
        bank.cashMachines[0].addTransaction(-50);
        bank.cashMachines[1].addTransaction(-100);

        assertEquals(-75, bank.getAverageWithdrawal(), 0.001);
    }

    @Test
    public void testAverageDeposit() {
        bank.cashMachines[0].addTransaction(100);
        bank.cashMachines[1].addTransaction(200);

        assertEquals(150, bank.getAverageDeposit(), 0.001);
    }

    @Test
    public void testEmptyBank() {
        assertEquals(0, bank.getTotalBalance(), 0.001);
        assertEquals(0, bank.getTotalWithdrawalCount());
        assertEquals(0, bank.getTotalDepositCount());
        assertEquals(0, bank.getAverageWithdrawal(), 0.001);
        assertEquals(0, bank.getAverageDeposit(), 0.001);
    }

    @AfterEach
    public void tearDown() {
        bank = null;
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Testing completed!");
    }
}
