package com.wallet.transaction.service;



import java.util.List;

import com.wallet.transaction.dto.TransactionHistoryDTO;

public interface TransactionHistoryService {

    List<TransactionHistoryDTO> getTransactionsByUserName(String name);

}
 