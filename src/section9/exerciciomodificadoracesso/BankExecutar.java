package section9.exerciciomodificadoracesso;

public class BankExecutar {

    public static void executar() {

        System.out.println("BANCO 1");
        Bank b1 = new Bank("Bruno Noveli", "123-456-789");
        b1.printBalance();
        b1.deposit(500.0);
        b1.printBalance();
        b1.withdraw(300.0);
        b1.printBalance();

        System.out.println("BANCO 2");
        System.out.println();
        Bank b2 = new Bank("Bruno Zupp", "987-8547-1254", 1500.0);
        b2.printBalance();
        b2.deposit(300.0);
        b2.printBalance();
        b2.withdraw(1900.0);
        b2.printBalance();

    }
}
