package lexicon.se.model;

import lexicon.se.model.exception.InsufficientBalanceException;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Wallet {
    // Fields
    private final  String id;
    private final String walletName;
    private final Map<CryptoCurrency,BigDecimal> cryptoCurrencies;
    public Wallet(String walletName){
        this.id = UUID.randomUUID().toString();
        this.cryptoCurrencies = new HashMap<CryptoCurrency, BigDecimal>();
        this.walletName = walletName ;
    }

    public String getId() {
        return id;
    }

    public String getWalletName() {
        return walletName;
    }

    public Map<CryptoCurrency, BigDecimal> getCryptoCurrencies() {
        return cryptoCurrencies;
    }
      public BigDecimal getBalance(CryptoCurrency cryptoCurrency){
        return  cryptoCurrencies.getOrDefault(cryptoCurrency,BigDecimal.ZERO);
      }
    public void deposit(CryptoCurrency cryptoCurrency, BigDecimal amount){
   if (amount.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("Deposit amount must be that zero.");


           BigDecimal currentBalance = getBalance(cryptoCurrency);
           BigDecimal newBalance = currentBalance.add(amount);

           cryptoCurrencies.put(cryptoCurrency, newBalance);
       }



     public void withdraw(CryptoCurrency cryptoCurrency,BigDecimal amount){
   if (amount.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("Deposit amount must be grater that zero.");

        BigDecimal currentBalance = getBalance(cryptoCurrency);
      if (currentBalance.compareTo(amount) < 0) throw new InsufficientBalanceException("Insufficient Balance for withdrawal .");
        BigDecimal newBalance = currentBalance.add(amount);
        cryptoCurrencies.put(cryptoCurrency,newBalance);

   }

    @Override
    public String toString() {
        return "Wallet{" +
                "id='" + id + '\'' +
                ", walletName='" + walletName + '\'' +
                ", cryptoCurrencies=" + cryptoCurrencies +
                '}';
    }



      }





