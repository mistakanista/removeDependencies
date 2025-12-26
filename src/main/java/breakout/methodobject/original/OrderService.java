package breakout.methodobject.original;

public class OrderService {
    public double calculateOrderPrice(int quantity, double unitPrice, double discount, double taxRate) {
        // ... many things before
        double price = quantity * unitPrice;
        if (discount > 0) {
            price -= price * discount;
        }
        price += price * taxRate;
        // many things after ...
        return price;

    }
}
