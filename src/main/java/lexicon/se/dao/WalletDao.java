package lexicon.se.dao;

import lexicon.se.model.Wallet;

import java.util.Optional;

public interface WalletDao {
    Wallet createWallet(Wallet wallet);
     Optional<Wallet> getWallet(String id);

    Optional<Wallet> findWallet(String id);

}
