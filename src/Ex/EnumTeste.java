package Ex;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class EnumTeste {
    static void main() {
        Order order = new Order(4050, new Date(), OrderStatus.PROCESSANDO);

        System.out.println(order);
    }
}
