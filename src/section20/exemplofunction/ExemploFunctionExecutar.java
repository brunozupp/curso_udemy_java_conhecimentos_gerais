package section20.exemplofunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExemploFunctionExecutar {

    public static void executar() {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse",50.0));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case",80.90));

        //List<String> names = list.stream().map(new ProductFunction()).collect(Collectors.toList());

        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //List<String> names = list.stream().map(Product::noStaticUpperCaseName).collect(Collectors.toList());

        //List<String> names = list.stream().map((p) -> p.getName().toUpperCase()).collect(Collectors.toList());

        Function<Product, String> function = (p) -> p.getName().toUpperCase();
        List<String> names = list.stream().map(function).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
