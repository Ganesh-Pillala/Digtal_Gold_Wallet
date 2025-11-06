package com.wallet.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.wallet.transaction.dto.TransactionHistoryDTO;
import com.wallet.transaction.entity.Users;
import com.wallet.transaction.repository.TransactionHistoryRepository;
import com.wallet.transaction.repository.UsersRepository;
import com.wallet.transaction.service.TransactionHistoryService;

import java.util.List;

import java.util.stream.Collectors;

@Service

public class TransactionHistoryServiceImpl implements TransactionHistoryService {

    @Autowired

    private UsersRepository usersRepository;

    @Autowired

    private TransactionHistoryRepository txRepo;

    @Override

    public List<TransactionHistoryDTO> getTransactionsByUserName(String name) {

        Users user = usersRepository.findAll().stream()

                .filter(u -> u.getName().equalsIgnoreCase(name.trim()))

                .findFirst()

                .orElseThrow(() -> new RuntimeException("User not found: " + name));

        return txRepo.findByUser(user).stream()

                .map(tx -> new TransactionHistoryDTO(

                        tx.getTransactionId(),

                        tx.getQuantity(),

                        tx.getBranchId(),

                        user.getName()

                ))

                .collect(Collectors.toList());

    }

}
 