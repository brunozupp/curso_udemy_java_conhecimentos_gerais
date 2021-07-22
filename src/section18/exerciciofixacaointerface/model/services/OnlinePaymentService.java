package section18.exerciciofixacaointerface.model.services;

import section18.exerciciofixacaointerface.model.entities.Contract;
import section18.exerciciofixacaointerface.model.entities.Installment;

import java.util.Date;
import java.util.List;

public interface OnlinePaymentService {

    public void calculateInstallments(Integer numberOfInstallments, Contract contract);

    // Taxa de pagamento
    Double paymentFee(Double amount);

    // Juro
    Double interest(Double amount, Integer months);
}
