package lexicon.se.model;

public enum CryptoCurrency {
    BTC("Bitcoin"),ETH("Ethereum"),USDT("TetherUs"),BNB("BNB");

    private String name;
      CryptoCurrency(String name){
          this.name = name;

      }
}
