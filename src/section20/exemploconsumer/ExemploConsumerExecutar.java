package section20.exemploconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ExemploConsumerExecutar {

    public static void executar() {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse",50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case",80.90));

//        list.forEach((p) -> {
//            p.setPrice(p.getPrice() + (p.getPrice() * 0.1));
//        });

//        list.forEach(new ProductConsumer());

//        list.forEach(Product::noStaticIncreasePrice);

//        list.forEach(Product::staticIncreasePrice);

        Consumer<Product> consumer = (p) -> p.setPrice(p.getPrice() * 1.1);
        list.forEach(consumer);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
