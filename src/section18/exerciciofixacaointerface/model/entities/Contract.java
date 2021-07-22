package section18.exerciciofixacaointerface.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer number;
    private Date date;
    private Double totalPrice;

    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, Date date, Double totalPrice) {
        this.number = number;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addInstallment(Installment installment) {
        this.installments.add(installment);
    }

    public void removeInstallment(Installment installment) {
        this.installments.remove(installment);
    }

    public void show() {
        System.out.printf("Number: %d%nData: %s%nValor total: R$ %.2f%n%n", number, sdf.format(date), totalPrice);

        System.out.println("Parcelas:");

        double sum = 0.0;
        for (Installment installment : installments) {
            System.out.printf("Data: %s - Valor: R$ %.2f%n", sdf.format(installment.getDate()), installment.getPrice());
            sum += installment.getPrice();
        }

        System.out.println();

        System.out.printf("Total a pagar no final: %.2f%n", sum);
    }
}
