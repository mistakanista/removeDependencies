package adapt.parameter.resolved;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {
    static class DummySender implements MessageSender {
        String lastMessage;
        @Override
        public void send(String message) {
            lastMessage = message;
        }
    }

    @Test
    void testPlaceOrderSendsMessage() {
        DummySender dummySender = new DummySender();
        OrderService service = new OrderService(dummySender);

        service.placeOrder("TestBestellung");

        assertEquals("Bestellung erhalten: TestBestellung", dummySender.lastMessage);
    }
}