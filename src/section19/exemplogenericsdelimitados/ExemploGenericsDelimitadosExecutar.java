package section19.exemplogenericsdelimitados;

import section19.exemplogenericsdelimitados.entities.Product;
import section19.exemplogenericsdelimitados.services.CalculationService;
import section19.exemplogenericsdelimitados.services.CalculationServiceStatic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExemploGenericsDelimitadosExecutar {

    public static void executar() {

        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section19\\exemplogenericsdelimitados\\storage\\products.csv";

        List<Product> products = new ArrayList<>();

        CalculationService<Product> cs = new CalculationService<Product>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                products.add(new Product(line));
                line = br.readLine();
            }

            Product product1 = cs.max(products);
            System.out.println("Produto 1 com servico instanciado:");
            System.out.println(product1.getName() + " - " + product1.getPrice());

            System.out.println();

            Product product2 = CalculationServiceStatic.max(products);
            System.out.println("Produto 2 com servico estático:");
            System.out.println(product2.getName() + " - " + product2.getPrice());

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
