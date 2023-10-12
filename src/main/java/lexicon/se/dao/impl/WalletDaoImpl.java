package lexicon.se.dao.impl;

import lexicon.se.dao.WalletDao;
import lexicon.se.model.Wallet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WalletDaoImpl implements WalletDao {
    private List<Wallet> storage;
    public  WalletDaoImpl(){
        System.out.println("Wallet list is initialized and ready to used...");
        this.storage = new ArrayList<>();
    }
    @Override
    public Wallet createWallet(Wallet wallet) {
        storage.add(wallet);
        return wallet;
    }

    @Override
    public Optional<Wallet> getWallet(String id) {
        return storage.stream()
                .filter(wallet -> wallet.getId().equals(id))
                .findFirst();

    }
}
