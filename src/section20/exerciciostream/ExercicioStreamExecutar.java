package section20.exerciciostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStreamExecutar {

    public static void executar() {

        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section20\\exerciciostream\\products.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> products = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                products.add(new Product(line));
                line = br.readLine();
            }

            Double average = products.stream().map(p -> p.getPrice()).reduce(0.0, Double::sum) / products.size();
            System.out.println("Preço médio = " + average);

            Comparator<Product> comparator = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

            List<Product> productsAboveAverage = products.stream()
                    .filter(p -> p.getPrice() < average)
                    .sorted(comparator.reversed())
                    .collect(Collectors.toList());

            for (Product product : productsAboveAverage) {
                System.out.println(product.getName());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
