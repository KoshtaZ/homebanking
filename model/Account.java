package model;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private Long id;
    private Integer accounNumber;
    private Client holder;

    private List<Client> secondaryHolder;
    protected Double balance;

    public Account(){
    }

    public Account(Long id, Integer accounNumber, Client holder, List<Client> secondaryHolder, Double balance) {
        this.id = id;
        this.accounNumber = accounNumber;
        this.holder = holder;
        this.secondaryHolder = secondaryHolder;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public Integer getAccounNumber() {
        return accounNumber;
    }

    public void setAccounNumber(Integer accounNumber) {
        this.accounNumber = accounNumber;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public List<Client> getSecondaryHolder() {
        return secondaryHolder;
    }

    public void setSecondaryHolder(List<Client> secondaryHolder) {
        this.secondaryHolder = secondaryHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposited(double amount){
        balance += amount;
    }

    public double amount(){
        return balance;
    }

    @Override
    public String toString() {
        List<String> secondaryHolderNames = new ArrayList<String>();
        for (Client c: secondaryHolder) {
            String name = c.getName();
            secondaryHolderNames.add(name);
        }
        return "Account{" +
                "id=" + id +
                ", accounNumber=" + accounNumber +
                ", holder=" + holder +
                ", secondaryHolder=" + secondaryHolderNames +
                ", balance=" + balance +
                '}';
    }
}
