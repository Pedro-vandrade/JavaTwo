package application;

import entities.Order;
import entities.OrderStatus;

import java.util.Date;

public class AppEnum {
    static void main(String[] args) {


        Order order = new Order(1001, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
        // Conversão de String p/ enum
        // order status sendo chamado de os1
        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println("Package: " + os2);

    }
}
