package com.sg.kata.core;

import com.sg.kata.core.exceptions.InsufficientFundsException;
import com.sg.kata.core.exceptions.NegativeAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class BankAccountTest {
    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

    // Deposit use case
    @Test
    void depositPositiveAmount() throws NegativeAmountException {
        //GIVEN
        bankAccount.deposit(new BigDecimal(1000));
        //WHEN
        BigDecimal balance = bankAccount.getBalance();
        //THEN
        assertEquals(new BigDecimal(1000), balance);
    }

    @Test
    void throwNegativeAmountExceptionWhenDepositNegativeAmount() {
        //THEN
        assertThrowsExactly(NegativeAmountException.class, () -> bankAccount.deposit(new BigDecimal(-100)));
    }

    // Withdraw use case
    @Test
    void withdrawPositiveAmount() throws NegativeAmountException, InsufficientFundsException {
        //GIVEN
        bankAccount.deposit(new BigDecimal(1000));
        //WHEN
        bankAccount.withdraw(new BigDecimal(800));
        BigDecimal balance = bankAccount.getBalance();
        //THEN
        assertEquals(new BigDecimal(200), balance);
    }

    @Test
    void throwInsufficientFundsExceptionWhenAmountGreaterThenBalance() {
        //THEN
        assertThrowsExactly(InsufficientFundsException.class, () -> bankAccount.withdraw(new BigDecimal(100)));
    }

    @Test
    void throwNegativeAmountExceptionWhenWithdrawNegativeAmount() {
        //THEN
        assertThrowsExactly(NegativeAmountException.class, () -> bankAccount.withdraw(new BigDecimal(-100)));
    }

    // Get history use case
    @Test
    void getHistory() throws NegativeAmountException, InsufficientFundsException {
        //GIVEN
        bankAccount.deposit(new BigDecimal(1000));
        bankAccount.withdraw(new BigDecimal(200));
        bankAccount.withdraw(new BigDecimal(300));
        //WHEN
        int listOfHistorySize = bankAccount.getHistory().size();
        //THEN
        assertEquals(3, listOfHistorySize);
    }

}
