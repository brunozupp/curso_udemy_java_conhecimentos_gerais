package section14.polimorfismofixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return String.format("%s (used) - R$ %.2f (Manufacture date: %s)", name, price, simpleDateFormat.format(manufactureDate));
    }
}
