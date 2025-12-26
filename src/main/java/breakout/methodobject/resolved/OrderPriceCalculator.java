package breakout.methodobject.resolved;

public class OrderPriceCalculator {
    private final int quantity;
    private final double unitPrice;
    private final double discount;
    private final double taxRate;

    public OrderPriceCalculator(int quantity, double unitPrice, double discount, double taxRate) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.taxRate = taxRate;
    }

    public double calculate() {
        double price = quantity * unitPrice;
        if (discount > 0) {
            price -= price * discount;
        }
        price += price * taxRate;
        return price;
    }
}
