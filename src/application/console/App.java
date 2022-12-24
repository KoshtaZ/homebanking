package src.application.console;

import src.model.Account;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("\t\tWelcome");
        System.out.println("________________________");
        System.out.println("   Want do you need?");
        System.out.println("------------------------");
        System.out.println("1. ATM");
        System.out.println("2. Card");
        System.out.println("3. Manage account");

        int num = scan.nextInt();
        switch (num){
            case 1: atm();
                break;
            case 2: card();
                break;
            case 3: manageAccount();
                break;
        }
    }
    public static void atm(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");


        int num = scan.nextInt();
        switch (num)
        {
            case 1:
                System.out.print("Amount $ ");
                double amount = scan.nextDouble();
                ATM.deposit(amount);
                break;
            case 2:
                System.out.print("Amount $ ");
                amount = scan.nextDouble();
                ATM.withdraw(amount);
                break;
            case 3:
                Account account = new Account();
                System.out.println("AccountNumber: ");
                int accountNumber = scan.nextInt();
               break;
        }

    }
    public static void manageAccount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Create account");
        System.out.println("Update data");
        System.out.println("Delete account");
        int num = scan.nextInt();
        switch (num){
            case 1: Management.createAccount();
                 break;
            case 2: Management.updateData();
                break;
            case 3: Management.deleteAccount();
        }
    }
    public static void card(){

    }
}

