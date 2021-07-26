package section20.funcaocomoargumento;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FuncaoComoArgumentoExecutar {

    public static void executar() {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse",50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case",80.90));

        Double value = sum(list, p -> p.getName().startsWith("T"));

        System.out.println(value);

        //List<Double> prices = list.stream().map(p -> p.getPrice()).collect(Collectors.toList());
        List<Double> prices = toOther(list, (p) -> p.getPrice());
        prices.forEach(System.out::println);
    }

    private static Double sum(List<Product> list, Predicate<Product> predicate) {
        double sum = 0.0;

        for (Product p : list) {
            if(predicate.test(p)) {
                sum += p.getPrice();
            }
        }

        return sum;
    }

    private static <T extends Object,E extends Object> List<E> toOther(List<T> list, Function<T,E> func) {
        return list.stream().map(func).collect(Collectors.toList());
    }
}
