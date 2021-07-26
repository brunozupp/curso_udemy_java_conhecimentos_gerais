package section20.exemploconsumer;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticIncreasePrice(Product p) {
        p.setPrice(p.getPrice() + (p.getPrice() * 0.1));
    }

    public void noStaticIncreasePrice() {
        price += (price * 0.1);
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f",name,price);
    }
}
