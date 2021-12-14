package com.sg.kata.core.use_cases;

import com.sg.kata.core.BankAccount;
import com.sg.kata.core.exceptions.NegativeAmountException;

import java.math.BigDecimal;

public interface DepositUseCase {
    void deposit(BankAccount bankAccount, BigDecimal amount) throws NegativeAmountException;
}
