package com.sg.kata.core.use_cases;

import com.sg.kata.core.BankAccount;
import com.sg.kata.core.exceptions.InsufficientFundsException;
import com.sg.kata.core.exceptions.NegativeAmountException;

import java.math.BigDecimal;

public interface WithdrawUseCase {
    void withdraw(BankAccount bankAccount, BigDecimal amount) throws InsufficientFundsException, NegativeAmountException;
}
