package lexicon.se.service.impl;

import lexicon.se.dao.TransactionDao;
import lexicon.se.dao.WalletDao;
import lexicon.se.model.CryptoCurrency;
import lexicon.se.model.Transaction;
import lexicon.se.model.Wallet;
import lexicon.se.model.exception.WalletValidationException;
import lexicon.se.service.TransactionManagement;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class TransactionManagementImpl implements TransactionManagement {
  private WalletDao walletDao;
  private TransactionDao transactionDao;
  public TransactionManagementImpl(WalletDao walletDao,TransactionDao transactionDao){
             this.transactionDao = transactionDao;
             this.walletDao =walletDao;

  }
    @Override
    public Transaction createDepositTransaction(String walletId, CryptoCurrency cryptoCurrency, BigDecimal amount, String description) {


      if (walletId == null );
      throw  new IllegalArgumentException("wallet params were not valid.");
        Optional<Wallet> optionalWallet = walletDao.findWallet(walletId);
        if (optionalWallet.isEmpty()) throw new WalletValidationException("wallet not found.");

        Wallet wallet = optionalWallet.get();
        wallet.deposit(cryptoCurrency,amount);
        Transaction transaction = new Transaction("DEPOSIT",amount,walletId,cryptoCurrency.getName());
        transaction.setDescription("first deposit transaction for test");

        Transaction createdTransaction = transactionDao.createTransaction(transaction);

      return createdTransaction;

    }

    @Override
    public Transaction createWithdraTransaction(String WalletId, CryptoCurrency CryptoCurrency, BigDecimal amount, String description) {
        return null;
    }

    @Override
    public List<Transaction> getTransactionByWalletId(String walletId) {
        return null;
    }
}








