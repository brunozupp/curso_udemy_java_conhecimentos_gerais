package section15;

import section15.model.entities.Account;
import section15.model.exceptions.DomainFixacaoException;

public class ExcecaoFixacaoExecutar {

    public static void executar() {

        //Account account = new Account(1000,"Bruno Noveli",0.0,500.0);
        Account account = new Account(1000,"Bruno Noveli",1500.0,500.0);

        try {
            //account.deposit(-2.0);

            account.deposit(0.01);

            account.withdraw(30.0);

            System.out.println(account);

        } catch (DomainFixacaoException e) {
            System.out.println("Erro de domínio: " + e.getMessage());
        }
    }
}
