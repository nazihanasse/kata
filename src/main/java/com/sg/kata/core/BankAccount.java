package com.sg.kata.core;

import com.sg.kata.core.exceptions.InsufficientFundsException;
import com.sg.kata.core.exceptions.NegativeAmountException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.sg.kata.core.enums.OperationType.DEPOSIT;
import static com.sg.kata.core.enums.OperationType.WITHDRAWAL;

public class BankAccount {
    private Long id;
    private BigDecimal balance;
    private List<Operation> operations;

    BankAccount() {
        operations = new ArrayList<>();
        this.balance = BigDecimal.ZERO;
    }

    void deposit(BigDecimal amount) throws NegativeAmountException {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NegativeAmountException("Unauthorized operation: Operation amount must be greater than zero");
        } else {
            balance = balance.add(amount);
            this.operations.add(new Operation(DEPOSIT, amount, balance));
        }
    }

    void withdraw(BigDecimal amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NegativeAmountException("Unauthorized operation: Operation amount must be greater than zero");
        } else if (this.balance.compareTo(amount) < 0) {
            throw new InsufficientFundsException("Unauthorized operation: Insufficient funds");
        } else {
            balance = balance.subtract(amount);
            this.operations.add(new Operation(WITHDRAWAL, amount, balance));
        }
    }

    List<Operation> getHistory() {
        return operations;
    }

    BigDecimal getBalance() {
        return balance;
    }

}

