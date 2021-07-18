package section14.polimorfismofixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PolimorfismoFixacaoExecutar {

    public static void executar() throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        products.add(new Product("Produto normal", 145.0));
        products.add(new ImportedProduct("Produto importado", 287.9, 50.0));
        products.add(new UsedProduct("Produto usado", 47.5, simpleDateFormat.parse("17/08/2018")));

        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}
