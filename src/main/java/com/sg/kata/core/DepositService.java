package com.sg.kata.core;

import com.sg.kata.core.exceptions.NegativeAmountException;
import com.sg.kata.core.use_cases.DepositUseCase;

import java.math.BigDecimal;

/**
 * An implementation of the DepositUseCase
 * Communicate with the outside ( Repository, api for example)
 */
public class DepositService implements DepositUseCase {
    @Override
    public void deposit(BankAccount bankAccount, BigDecimal amount) throws NegativeAmountException {
        bankAccount.deposit(amount);
    }
}



