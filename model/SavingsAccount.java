package model;

import java.util.List;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Long id, Integer accounNumber, Client holder, List<Client> secondaryHolder, Double balance, Double interestRate) {
        super(id, accounNumber, holder, secondaryHolder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

}
