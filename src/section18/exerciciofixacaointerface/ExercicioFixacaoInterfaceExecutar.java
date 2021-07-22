package section18.exerciciofixacaointerface;

import section18.exerciciofixacaointerface.model.entities.Contract;
import section18.exerciciofixacaointerface.model.services.ContractService;
import section18.exerciciofixacaointerface.model.services.OnlinePaymentService;
import section18.exerciciofixacaointerface.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExercicioFixacaoInterfaceExecutar {

    public static void executar() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Contract contract = new Contract(1400, sdf.parse("25/06/2018"), 600.00);

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, 3);

        contract.show();

    }
}
