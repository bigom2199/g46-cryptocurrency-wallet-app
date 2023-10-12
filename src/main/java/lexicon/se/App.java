package lexicon.se;

import lexicon.se.config.AppConfig;
import lexicon.se.dao.TransactionDao;
import lexicon.se.dao.WalletDao;
import lexicon.se.dao.impl.TransactionDaoImpl;
import lexicon.se.dao.impl.WalletDaoImpl;
import lexicon.se.model.CryptoCurrency;
import lexicon.se.model.Transaction;
import lexicon.se.model.Wallet;
import lexicon.se.service.TransactionManagement;
import lexicon.se.service.WalletManagement;
import lexicon.se.service.impl.TransactionManagementImpl;
import lexicon.se.service.impl.WalletManagementImpl;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    // WalletDao walletDao = new WalletDaoImpl();
   // TransactionDao transactionDao = new TransactionDaoImpl();
       // WalletManagement walletManagement = new WalletManagementImpl(walletDao);
     // TransactionManagement transactionManagement = new TransactionManagementImpl(walletDao,transactionDao);



       AnnetationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      WalletManagement walletManagement = context.getBean(WalletManagement.class);
      TransactionManagement transactionManagement = context.getBean(TransactionManagement.class);





    Wallet myWallet =walletManagement.create("my-first-wallet");
     Transaction depositTransactionForBTC = transactionManagement.createDepositTransaction(
             myWallet.getId(),
             CryptoCurrency.BTC,
             new BigDecimal(1),"Test");

      System.out.println(walletManagement.getById(mywallet.getId()));
      Transaction depositTransactionForETH = transactionManagement.createDepositTransaction(
              myWallet.getId(),
              CryptoCurrency.ETH,
              new BigDecimal(10),

                     "Test"     );









}


