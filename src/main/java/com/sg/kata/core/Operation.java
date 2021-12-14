package com.sg.kata.core;

import com.sg.kata.core.enums.OperationType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Operation {
    private Long id;
    private OperationType type;
    private LocalDateTime date;
    private BigDecimal amount;
    private BigDecimal balance;

    Operation(OperationType type, BigDecimal amount, BigDecimal balance) {
        this.type = type;
        this.date = LocalDateTime.now();
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "  type=" + type +
                ", date=" + date +
                ", amount=" + amount +
                ", balance=" + balance +
                '}';
    }
}
