package aula04;
import java.util.ArrayList;

class CashRegister {

    private ArrayList<Product> products;

    public CashRegister() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalValue();
        }
        return total;
    }

    public String toString() {
        String result = "";
        result += String.format("%-15s %-10s %-10s %-10s\n", "Product", "Price", "Quantity", "Total");
        for (Product p : products) {
            result += String.format("%-15s %-10.2f %-10d %-10.2f\n", p.getName(), p.getPrice(), p.getQuantity(), p.getTotalValue());
        }
        result += String.format("\nTotal value: %-10.2f", getTotal());
        return result;
    }
}
