package section14.heranca;

public class HerancaExecutar {

    public static void executar() {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING -> subclasses podem ser recebidas por variáveis do tipo da superclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);

        // DOWNCASTING - converter um objeto da superclasse para a subclasse
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // dá erro pq acc3 é do tipo SavingsAccount
        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
    }
}
