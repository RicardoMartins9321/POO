package aula08;


public interface Produto {
    String getName();
    double getPrice();
    int getAmount();
    void addAmount(int amount);
    void removeQuantity(int quantity);
}
