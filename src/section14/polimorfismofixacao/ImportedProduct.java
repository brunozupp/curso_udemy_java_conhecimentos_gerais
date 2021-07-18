package section14.polimorfismofixacao;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s - R$ %.2f (Customs fee: R$ %.2f)", name, totalPrice(), customsFee);
    }
}
