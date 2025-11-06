package com.wallet.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.wallet.transaction.dto.TransactionHistoryDTO;
import com.wallet.transaction.service.TransactionHistoryService;

import java.util.List;

@RestController

@RequestMapping("/api/transactions")

public class TransactionHistoryController {

    @Autowired

    private TransactionHistoryService txService;

    @GetMapping("/by-name")

    public List<TransactionHistoryDTO> getTransactionsByUserName(@RequestParam String name) {

        return txService.getTransactionsByUserName(name);

    }

}
 