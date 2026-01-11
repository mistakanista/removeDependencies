package encapsulate.global.reference.originial;

import lombok.Data;

import static original.OrderService.ORDER_PLACED;


@Data
public class OrderService {
    public void placeOrder(String order) {
        EmailSystem.send(ORDER_PLACED + order);
    }
}
