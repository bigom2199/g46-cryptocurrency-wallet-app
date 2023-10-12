package lexicon.se.service;

import lexicon.se.model.CryptoCurrency;
import lexicon.se.model.Transaction;

import java.math.BigDecimal;
import java.util.List;

public interface TransactionManagement {
    Transaction createDepositTransaction(String walletId, CryptoCurrency cryptoCurrency, BigDecimal amount,String description);


    Transaction createWithdraTransaction(String WalletId,CryptoCurrency CryptoCurrency, BigDecimal amount,String description);
    List<Transaction> getTransactionByWalletId(String walletId);
}
