package section8.exercicioproduto;

public class Produto {

    private String name;
    private double price;
    private int quantity;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Produto(String name, double price, int quantity) {
        this(name,price);
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public double total() {
        return (double) quantity * price;
    }

    public void print() {
        System.out.printf("Produto: %s%nPreço: R$: %.2f%nQuantidade: %d%nTotal de mercadoria em R$: %.2f%n",name,price,quantity,total());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                ", quantity=" + quantity +
                '}';
    }
}
