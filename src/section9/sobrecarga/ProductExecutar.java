package section9.sobrecarga;

import section8.exercicioproduto.Produto;

public class ProductExecutar {

    public static void executar() {

        Product product = new Product("Arroz", 15.5, 30);
        product.print();

        product.addProducts(7);
        product.print();

        product.removeProducts(4);
        product.print();
    }
}
