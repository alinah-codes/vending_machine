package interfaces;

public interface PaymentReceiver {
    void addMoney(int amount);
    int getAmount();
    void setAmount(int amount);
}
