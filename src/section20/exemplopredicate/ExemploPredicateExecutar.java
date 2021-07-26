package section20.exemplopredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicateExecutar {

    public static void executar() {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse",50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case",80.90));

        //list.removeIf(p -> p.getPrice() >= 100.0);

        //list.removeIf(new ProductPredicate());

        // Conhecido como method reference
        //list.removeIf(Product::staticProductPredicate);

        //list.removeIf(Product::noStaticProductPredicate);

        Predicate<Product> predicate = (p) -> p.getPrice() >= 100;
        list.removeIf(predicate);

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
