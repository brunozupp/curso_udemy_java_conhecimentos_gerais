package section14.classeabstrata;

import java.util.ArrayList;
import java.util.List;

public class ClasseAbstrataExecutar {

    public static void executar() {

        // Vai dar erro por conta do abstract na classe Account
        // Account acc1 = new Account(1001, "Alex", 1000.0);

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

        List<Account> accounts = new ArrayList<>();
        accounts.add(acc2);
        accounts.add(acc3);

        totalBalance(accounts);
        deposit(accounts);
        totalBalance(accounts);

    }

    private static void totalBalance(List<Account> accounts) {
        var sum = 0.0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        System.out.printf("Saldo total = %.2f%n", sum);
    }

    private static void deposit(List<Account> accounts) {
        for (Account account : accounts) {
            account.deposit(10.0);
        }
    }
}
