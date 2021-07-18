package section13.exerciciofixacao;

import section13.interfaces.BaseEntity;

public class Product implements BaseEntity {

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

    @Override
    public void show() {
        System.out.printf("Produto = %s%nPreço = R$ %.2f%n", name, price);
    }
}
