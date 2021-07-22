package section18.exerciciofixacaointerface.model.services;

import section18.exerciciofixacaointerface.model.entities.Contract;
import section18.exerciciofixacaointerface.model.entities.Installment;

import java.util.Calendar;

public class PaypalService implements OnlinePaymentService {

    private static final double PAYMENT_FEE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public void calculateInstallments(Integer numberOfInstallments, Contract contract) {

        double valuePerMonth = contract.getTotalPrice() / numberOfInstallments;

        Calendar cal = Calendar.getInstance();

        for (int i = 1; i <= numberOfInstallments; i++) {

            double monthlySimpleInterest = valuePerMonth + (valuePerMonth * 0.01 * i);
            double totalValue = monthlySimpleInterest + (monthlySimpleInterest * 0.02);

            cal.setTime(contract.getDate());
            cal.add(Calendar.MONTH, i);

            contract.addInstallment(new Installment(cal.getTime(), totalValue));
        }
    }

    // Taxa de pagamento
    @Override
    public Double paymentFee(Double amount) {
        return amount * PAYMENT_FEE;
    }

    // Juro
    @Override
    public Double interest(Double amount, Integer months) {
        return amount * months * MONTHLY_INTEREST;
    }


}
