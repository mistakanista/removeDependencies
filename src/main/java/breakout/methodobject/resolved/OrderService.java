package breakout.methodobject.resolved;

public class OrderService {
    public double calculateOrderPrice(int quantity, double unitPrice, double discount, double taxRate) {
        double price = 0.0;
        // ... many things before
        price = new OrderPriceCalculator(quantity, unitPrice, discount, taxRate).calculate();
        // many things after ...
        return price;
    }

}
