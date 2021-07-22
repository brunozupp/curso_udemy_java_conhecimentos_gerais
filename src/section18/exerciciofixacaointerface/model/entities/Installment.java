package section18.exerciciofixacaointerface.model.entities;

import java.util.Date;

// Parcelas
public class Installment {

    private Date date;
    private Double price;

    public Installment(Date date, Double price) {
        this.date = date;
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
