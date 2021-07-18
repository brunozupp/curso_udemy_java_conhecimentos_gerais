package section10.exerciciovetorparte2;

public class VetorParte2Executar {

    public static void executar() {

        int length = 3;
        Product[] products = new Product[length];

        products[0] = new Product("Produto 1", 50);
        products[1] = new Product("Produto 2", 100);
        products[2] = new Product("Produto 3", 150);

        for (int i = 0; i < products.length; i++) {
            products[i].show();
        }

        double sum = 0.0;

        for (int i = 0; i < products.length; i++) {
            sum += products[i].price;
        }

        double average = sum / products.length;

        System.out.printf("%2.f", average);
    }
}
