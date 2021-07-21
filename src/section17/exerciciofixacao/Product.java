package section17.exerciciofixacao;

public class Product {

    private String name;
    private double price;
    private double quantity;

    public Product(String lineFromCSV) {
        String[] parts = lineFromCSV.split(",");

        this.name = parts[0];
        this.price = Double.parseDouble(parts[1]);
        this.quantity = Integer.parseInt(parts[2]);
    }

    public String getName() {
        return name;
    }

    public double getTotal() {
        return price * quantity;
    }

    public String toLineCSV() {
        return name + "," + getTotal();
    }
}
