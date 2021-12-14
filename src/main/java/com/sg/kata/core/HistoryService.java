package com.sg.kata.core;

import com.sg.kata.core.use_cases.GetHistoryUseCase;

import java.util.List;

/**
 * An implementation of the GetHistoryUseCase
 * Communicate with the outside ( Repository, api for example)
 */
public class HistoryService implements GetHistoryUseCase {
    @Override
    public List<Operation> getHistory(BankAccount bankAccount) {
        return bankAccount.getHistory();
    }
}
