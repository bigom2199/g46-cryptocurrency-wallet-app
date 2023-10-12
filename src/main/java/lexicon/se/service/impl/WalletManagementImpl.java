package lexicon.se.service.impl;

import jdk.internal.access.JavaIOFileDescriptorAccess;
import lexicon.se.dao.WalletDao;
import lexicon.se.model.Wallet;
import lexicon.se.model.exception.WalletNotFoundException;
import lexicon.se.model.exception.WalletValidationException;
import lexicon.se.service.WalletManagement;

import java.util.Optional;

public class WalletManagementImpl implements WalletManagement {
  private WalletDao walletDao;

    public WalletManagementImpl(WalletDao walletDao) {
        this.walletDao = walletDao;
    }

    @Override
    public Wallet create(String walletName){
        if (walletName == null) throw new WalletValidationException("Param is not valid.","Invalid wallet name.","Wallet Name.");
        Wallet wallet = new Wallet(walletName);
           return walletDao.createWallet(wallet) ;
       }
       public Wallet getById(String id){
           Optional<Wallet> optionalWallet= walletDao.findWallet(id);
           if (optionalWallet.isEmpty()) throw new WalletNotFoundException("Wallet not found.");

           return OptionalWallet.get();
       }

}
