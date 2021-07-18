package section15.model.entities;

import section15.model.exceptions.DomainFixacaoException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) throws DomainFixacaoException {

        if(amount <= 0.0) {
            throw new DomainFixacaoException("O valor de deposito precisa ser maior ou igual a R$ 0.01");
        }

        this.balance += amount;
    }

    public void withdraw(Double amount) throws DomainFixacaoException {

        if(this.balance == 0.0) {
            throw new DomainFixacaoException("Saque não pode ser realizado pois o saldo é de 0.0 reais");
        }

        if(amount > this.balance) {
            throw new DomainFixacaoException("Valor do saque é maior que do saldo atual");
        }

        if(amount > this.withdrawLimit) {
           throw new DomainFixacaoException("Saque não pode ocorrer pois é superior ao limite permitido (R$ " + withdrawLimit + ")");
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s%nConta: %d%nSaldo atual: %.2f%nLimite de saque:%.2f%n",
                holder, number, balance, withdrawLimit);
    }
}
