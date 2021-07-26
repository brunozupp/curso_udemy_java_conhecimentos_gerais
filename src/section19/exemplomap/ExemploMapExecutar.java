package section19.exemplomap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMapExecutar {

    public static void executar() {

        exemplo2();
    }

    private static void exemplo1() {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "997256478");

        cookies.remove("email");

        cookies.put("phone", "997451247");

        System.out.println("Contains key 'phone': " + cookies.containsKey("phone"));

        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Tamanho do mapa: " + cookies.size());

        System.out.println("ALL COOKIES");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }

    private static void exemplo2() {

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv",900.0);
        Product p2 = new Product("Notebook",1200.0);
        Product p3 = new Product("Tablet",400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        // Para dar true eu preciso implementar os métodos hashCode e equals na classe Product
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
