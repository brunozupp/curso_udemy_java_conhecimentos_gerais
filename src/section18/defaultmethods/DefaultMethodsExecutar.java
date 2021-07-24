package section18.defaultmethods;

import section18.defaultmethods.services.BrazilInterestService;
import section18.defaultmethods.services.InterestService;
import section18.defaultmethods.services.UsaInterestService;

public class DefaultMethodsExecutar {

    public static void executar() {

        double amount = 200.0;
        int months = 3;

        InterestService brazil = new BrazilInterestService(2.0);
        InterestService usa = new UsaInterestService(1.0);

        System.out.printf("BRAZIL: %.2f%n", brazil.payment(amount,months));
        System.out.printf("EUA: %.2f%n", usa.payment(amount,months));
    }
}
