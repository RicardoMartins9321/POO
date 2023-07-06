package aula08;

public class ProdutoGenerico implements Produto {
    private String name;
    private int amount;
    private double price;

    public ProdutoGenerico(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
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
