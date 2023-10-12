package lexicon.se.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private String id;
    private String type;
    private BigDecimal amount;
    private String WalletId;
    private String cryptoCurrencySymbol;
    private String description;
    private LocalDateTime timestamp;
    public Transaction(String type, BigDecimal amount, String walletId, String cryptoCurrencySymbol) {
        if (amount.compareTo(BigDecimal.ZERO) < 0 )throw new IllegalArgumentException("Amount cannot be negative.");
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.amount = amount;
            this. WalletId = walletId;
        this.cryptoCurrencySymbol = cryptoCurrencySymbol;
        this.timestamp = LocalDateTime.now();

    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getWalletId() {
        return WalletId;
    }

    public String getCryptoCurrencySymbol() {
        return cryptoCurrencySymbol;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Transaction(String id, String type, BigDecimal amount, String walletId, String cryptoCurrencySymbol, String description, LocalDateTime timestamp) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        WalletId = walletId;
        this.cryptoCurrencySymbol = cryptoCurrencySymbol;
        this.description = description;
        this.timestamp = timestamp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", WalletId='" + WalletId + '\'' +
                ", cryptoCurrencySymbol='" + cryptoCurrencySymbol + '\'' +
                ", description='" + description + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
