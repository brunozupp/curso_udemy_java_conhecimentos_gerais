package section20.exerciciostream;

public class Product {

    private String name;
    private Double price;

    public Product(String lineFromCSV) {
        String[] fields = lineFromCSV.split(",");

        this.name = fields[0];
        this.price = Double.parseDouble(fields[1]);
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
}
