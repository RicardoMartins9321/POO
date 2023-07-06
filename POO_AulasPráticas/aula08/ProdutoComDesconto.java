package aula08;

public class ProdutoComDesconto implements Produto {
    private String name;
    private int amount;
    private double price;
    private double discount;

    public ProdutoComDesconto(String name, int amount, double price, double discount) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price - (price * discount / 100);
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void addAmount(int amount) {
        this.amount += amount;
    }

    @Override
    public void removeQuantity(int quantity) {
        if (quantity > amount) {
            throw new IllegalArgumentException("Cannot remove more than available amount");
        }
        amount -= quantity;
    }
}
