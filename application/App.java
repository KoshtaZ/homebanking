package application;

import model.Account;
import model.Client;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        //Client client = new Client(1111, 22222, "Jose", Date.from(Instant.parse(26/02/1196), 912912681, 222888853, "koshtaz@gmail.com", "Programmer" );
        //Account account = new Account(1234, new Client(123, 123, "Alex", 10.0);
        //Client client = new Account()

       // System.out.println(account.getBalance());


    }
}
