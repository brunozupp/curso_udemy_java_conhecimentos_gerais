package section13.entities;

import section13.interfaces.BaseEntity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class HourContract implements BaseEntity {

    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue() {
        return hours * valuePerHour;
    }

    public boolean verifyMonthAndYear(Integer month, Integer year) {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return month == localDate.getMonthValue() && year == localDate.getYear();
    }

    public Date getDate() {
        return date;
    }

    @Override
    public void show() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Data = %s%nValor por hora = R$ %.2f%nHoras = %d%n",
                simpleDateFormat.format(date),
                valuePerHour,
                hours
        );
    }

}
