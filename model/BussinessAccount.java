package model;

import java.util.List;

public class BussinessAccount extends Account{
    private Double loanLimit;

    public BussinessAccount() {
        super();
    }

    public BussinessAccount(Long id, Integer accounNumber, Client holder, List<Client> secondaryHolder, Double balance, Double loanLimit) {
        super(id, accounNumber, holder, secondaryHolder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    public void deposit(double amount){
        super.deposited(amount);
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "BussinessAccount{" +
                "loanLimit=" + loanLimit +
                ", balance=" + balance +
                '}';
    }
}
