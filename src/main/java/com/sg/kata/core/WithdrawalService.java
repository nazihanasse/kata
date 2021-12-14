package com.sg.kata.core;

import com.sg.kata.core.exceptions.InsufficientFundsException;
import com.sg.kata.core.exceptions.NegativeAmountException;
import com.sg.kata.core.use_cases.WithdrawUseCase;

import java.math.BigDecimal;

/**
 * An implementation of the WithdrawUseCase
 * Communicate with the outside ( Repository, api for example)
 */
public class WithdrawalService implements WithdrawUseCase {

    @Override
    public void withdraw(BankAccount bankAccount, BigDecimal amount) throws InsufficientFundsException, NegativeAmountException {
        bankAccount.withdraw(amount);
    }
}
