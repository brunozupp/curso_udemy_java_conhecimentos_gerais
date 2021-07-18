package section13.application;

import section13.entities.Order;
import section13.enums.OrderStatus;

import java.util.Date;

public class EnumTesteExecutar {

    public static void executar() {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus status = OrderStatus.valueOf("DELIVERED");
        System.out.println(status);
    }
}
