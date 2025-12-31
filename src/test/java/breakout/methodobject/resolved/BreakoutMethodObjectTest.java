package breakout.methodobject.resolved;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreakoutMethodObjectTest {

    @Test
    void testCalculateOrderPrice() {
        OrderService service = new OrderService();
        double result = service.calculateOrderPrice(10, 5.0, 0.1, 0.19);
        // Preis: 10*5=50, Rabatt: 50*0.1=5, nach Rabatt: 45, Steuer: 45*0.19=8.55, Gesamt: 53.55
        assertEquals(53.55, result, 0.01);
    }
}
