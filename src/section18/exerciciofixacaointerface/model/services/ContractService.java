package section18.exerciciofixacaointerface.model.services;

import section18.exerciciofixacaointerface.model.entities.Contract;
import section18.exerciciofixacaointerface.model.entities.Installment;

import java.util.Calendar;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {

        // Valor amortizado
        double basicQuota = contract.getTotalPrice() / months;

        Calendar cal = Calendar.getInstance();

        for (int i = 1; i <= months; i++) {

            double monthlySimpleInterest = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double valueToBePaid = monthlySimpleInterest + onlinePaymentService.paymentFee(monthlySimpleInterest);

            cal.setTime(contract.getDate());
            cal.add(Calendar.MONTH, i);

            contract.addInstallment(new Installment(cal.getTime(), valueToBePaid));
        }
    }
}
