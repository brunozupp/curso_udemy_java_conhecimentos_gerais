package section19.exemplogenericsdelimitados.entities;

public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    public Product(String lineFromCSV) {
        String[] parts = lineFromCSV.split(",");

        this.name = parts[0];
        this.price = Double.parseDouble(parts[1]);
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

    @Override
    public int compareTo(Product o) {
        return this.price.compareTo(o.price);
    }
}
