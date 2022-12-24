package src.application.console;

import src.model.Account;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    public static void deposit(double amount){

    }
    public static void withdraw(double amount){

    }
    public static void transfer(int accountNumber, double amount){
        List<Account> accountList = new ArrayList<>();
        if(!accountList.isEmpty()){
            for (Account aux: accountList){
                if (aux.getAccounNumber().equals(accountNumber));
                amount += aux.getBalance();
            }
        }



    }
}
