package section9.exerciciomodificadoracesso;

public class Bank {

    private String numberAccount;
    private String name;
    private double balance;

    private static final double TAX = 5.0;

    public Bank(String numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public Bank(String numberAccount, String name, double balance) {
        this(numberAccount, name);
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double value) {
        this.balance -= (value + TAX);
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void printBalance() {
        System.out.printf("Saldo atual = %.2f\n", balance);
    }
}
