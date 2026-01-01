package template.redefinition.resolved;


import static original.OrderService.ORDER_PLACED;

public class TestOrderService extends OrderService {

    String confirmationMessage;

    @Override
    protected void sendConfirmation(String order) {
        confirmationMessage = ORDER_PLACED+ order;
    }
}
