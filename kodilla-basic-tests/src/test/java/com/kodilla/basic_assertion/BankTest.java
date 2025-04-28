package com.kodilla.basic_assertion;

import com.kodilla.bank.homework.Bank;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank(2);
    }

    @Test
    public void testTotalBalance() {
        // Given
        bank.cashMachines[0].addTransaction(100);
        bank.cashMachines[0].addTransaction(-50);
        bank.cashMachines[1].addTransaction(200);
        bank.cashMachines[1].addTransaction(-100);

        // When
        double totalBalance = bank.getTotalBalance();

        // Then
        assertEquals(150, totalBalance, 0.001);
    }

    @Test
    public void testTotalWithdrawals() {
        // Given
        bank.cashMachines[0].addTransaction(-50);
        bank.cashMachines[1].addTransaction(-100);

        // When
        int totalWithdrawals = bank.getTotalWithdrawalCount();

        // Then
        assertEquals(2, totalWithdrawals);
    }

    @Test
    public void testTotalDeposits() {
        // Given
        bank.cashMachines[0].addTransaction(100);
        bank.cashMachines[1].addTransaction(200);

        // When
        int totalDeposits = bank.getTotalDepositCount();

        // Then
        assertEquals(2, totalDeposits);
    }

    @Test
    public void testAverageWithdrawal() {
        // Given
        bank.cashMachines[0].addTransaction(-50);
        bank.cashMachines[1].addTransaction(-100);

        // When
        double averageWithdrawal = bank.getAverageWithdrawal();

        // Then
        assertEquals(-75, averageWithdrawal, 0.001);
    }

    @Test
    public void testAverageDeposit() {
        // Given
        bank.cashMachines[0].addTransaction(100);
        bank.cashMachines[1].addTransaction(200);

        // When
        double averageDeposit = bank.getAverageDeposit();

        // Then
        assertEquals(150, averageDeposit, 0.001);
    }

    @Test
    public void testEmptyBank() {
        // Given

        // When & Then
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
