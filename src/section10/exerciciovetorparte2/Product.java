package section10.exerciciovetorparte2;

public class Product {

    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void show() {
        System.out.printf("%s - %.2f%n", name, price);
    }
}
