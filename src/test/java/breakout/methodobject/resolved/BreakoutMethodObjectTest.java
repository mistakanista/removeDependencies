package breakout.methodobject.resolved;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreakoutMethodObjectTest {

    @Test
    void testBreakoutMethodObject() {
        String order = "breakout-methodobject-123";
        TestPlaceOrderMethod method =
                new TestPlaceOrderMethod(order, "test@example.com");

        method.execute();

        assertEquals(
                "Order " + order + " for customer test@example.com",
                method.lastMessage
        );
    }
}
