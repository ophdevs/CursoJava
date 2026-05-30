<<<<<<< HEAD:src/Ex/EnumTeste.java
package Ex;
=======
package exercicios;
>>>>>>> 90621b692f9f72a07d1a7d753761b0564b5094c1:src/exercicios/EnumTeste.java

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class EnumTeste {
    static void main() {
        Order order = new Order(4050, new Date(), OrderStatus.PROCESSANDO);

        System.out.println(order);
    }
}
