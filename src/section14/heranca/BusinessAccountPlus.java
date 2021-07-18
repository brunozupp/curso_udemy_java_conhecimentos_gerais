package section14.heranca;

public class BusinessAccountPlus extends BusinessAccount {

    public BusinessAccountPlus(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance, loanLimit);
    }

    // Não pode ser sobrescrito porque está como final o método
//    @Override
//    public void withdraw(Double amount) {
//        super.withdraw(amount);
//    }
}
