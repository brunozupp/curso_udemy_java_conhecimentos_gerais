package section19.exemploset;

import java.util.Set;
import java.util.TreeSet;

public class ExemploIgualdadeTreeSetExecutar {

    public static void executar() {

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV",900.0));
        set.add(new Product("Notebook",1200.0));
        set.add(new Product("Tablet",400.0));

        // Vai dar erro se eu não implementar a interface Comparable no meu Product, pois é preciso dessa
        // implementação para ordenar os objetos
        for (Product p : set) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }
    }
}

