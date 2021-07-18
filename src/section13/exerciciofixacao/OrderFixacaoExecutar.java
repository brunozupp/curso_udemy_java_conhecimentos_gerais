package section13.exerciciofixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OrderFixacaoExecutar {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void executar() throws ParseException {

        Order order = new Order(
                OrderStatus.PROCESSING,
                new Client(
                        "Bruno",
                        "brunimzupp@hotmail.com",
                        simpleDateFormat.parse("21/04/1999")
                )
        );

        Product p1 = new Product("Geladeira", 100.0);
        Product p2 = new Product("Freezer", 150.0);
        Product p3 = new Product("Armario", 200.0);
        Product p4 = new Product("Celular", 250.0);

        order.addItem(new OrderItem(10, 170.0, p1));
        order.addItem(new OrderItem(15, 170.0, p1));
        order.addItem(new OrderItem(5, 250.0, p2));
        order.addItem(new OrderItem(20, 300.0, p3));
        order.addItem(new OrderItem(30, 500.0, p4));

        OrderItem itemToBeRemoved = order.findItem(item -> item.getProduct().getName().equals("Celular"));

        if(itemToBeRemoved != null) {
            order.removeItem(itemToBeRemoved);
        }

        order.show();

        System.out.printf("Preço a ser pago no pedido = R$ %.2f%n", order.total());
    }
}
