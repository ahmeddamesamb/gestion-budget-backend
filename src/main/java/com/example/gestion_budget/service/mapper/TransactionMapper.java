package com.example.gestion_budget.service.mapper;

import org.mapstruct.Mapper;
import com.example.gestion_budget.model.Transaction;
import com.example.gestion_budget.dto.TransactionDTO;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionDTO toDto(Transaction transaction);
    Transaction toEntity(TransactionDTO transactionDTO);
}
