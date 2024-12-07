package com.example.gestion_budget.service;
import com.example.gestion_budget.dto.TransactionDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TransactionService {
    TransactionDTO addTransaction(TransactionDTO transactionDTO);
    List<TransactionDTO> getAllTransactions();
    Optional<TransactionDTO> getTransactionById(UUID id);
    TransactionDTO updateTransaction(UUID id, TransactionDTO transactionDTO);
    void deleteTransaction(UUID id);
}
