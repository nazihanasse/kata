package com.sg.kata.core.use_cases;

import com.sg.kata.core.BankAccount;
import com.sg.kata.core.Operation;

import java.util.List;

public interface GetHistoryUseCase {
    List<Operation> getHistory(BankAccount bankAccount);
}
