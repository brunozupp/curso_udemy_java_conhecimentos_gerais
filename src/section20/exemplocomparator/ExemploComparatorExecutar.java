package section20.exemplocomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploComparatorExecutar {

    public static void executar() {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV",900.0));
        products.add(new Product("Notebook",1200.0));
        products.add(new Product("Tablet",450.0));

        // Esse não funciona pois precisaria de ter implementado a interface Comparable na classe Product
        //Collections.sort(products);

        // Forma 1 - criando uma classe que implementa Comparator<>
        //products.sort(new MyComparator());

        // Forma 2 - criando de forma anonima
//        Comparator<Product> comp1 = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };
//        products.sort(comp1);

        // Forma 3 - criando de forma anonima com expressão lambda
//        Comparator<Product> comp2 = (p1,p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };
//        products.sort(comp2);

        // Forma 4 - criando de forma anonima com expressão lambda (reduzida)
//        Comparator<Product> comp4 = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        products.sort(comp4);

        // Forma 5 -  Usando Comparator.comparing
//        Comparator<Product> comp4 = Comparator.comparing(p -> p.getName().toUpperCase());
//        products.sort(comp4);

        // Forma 6 - passando a expressão diretamente
        //products.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        // Forma 7 - passando a expressão Comparator.comparing diretamente
        products.sort(Comparator.comparing((p) -> p.getName().toUpperCase()));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
