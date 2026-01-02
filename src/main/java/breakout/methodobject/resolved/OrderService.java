package breakout.methodobject.resolved;

public class OrderService {

    public void placeOrder(String order, String email) {
        new PlaceOrderMethod(order, email).execute();
    }

}
