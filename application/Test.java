package application;

import model.Account;
import model.Client;

import java.text.ParseException;

import java.time.LocalDate;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);

        /*

        System.out.println("Insira os dados dos clientes: ");
        System.out.print("NIF: ");
        int nif = scan.nextInt();
        System.out.print("Password: ");
        int password = scan.nextInt();
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Birthday: (dd/MM/yyyy) ");
        String date = scan.next();
        Date birthday = sdf.parse(date);
        System.out.print("Telephone: ");
        int telephone = scan.nextInt();
        System.out.print("Cellphone: ");
        int cellphone = scan.nextInt();
        System.out.print("Email: ");
        scan.nextLine();
        String email = scan.nextLine();
        System.out.print("Profession: ");
        String profession = scan.nextLine();

        Client client = new Client(nif, password, name, birthday, telephone, cellphone, email, profession);
        System.out.println(client);

         */
        Client client = new Client(1111, 1231, "Alex", LocalDate.of(1996,02, 26), 923511073, 912912685, "koshtaz@gmail.com", "student");
        System.out.println(client);

        //Client client2 = new Client(1111, 1231, "Jose", LocalDate.of(1997, 03, 11), 923511073, 912912685, "koshtaz@gmail.com", "student");
        //System.out.println(client2);

        //List<Client> secondary = new ArrayList<Client>();
        //secondary.add(client2);

        Client secondaryClient = new Client(1111, 1231, "Jose", LocalDate.of(1997, 03, 11), 923511073, 912912685, "koshtaz@gmail.com", "student");
        System.out.println(secondaryClient);

        Client secondaryClient2 = new Client(1111, 1231, "Hinata", LocalDate.of(1997, 03, 11), 923511073, 912912685, "koshtaz@gmail.com", "student");
        System.out.println(secondaryClient2);

        Account account = new Account(1212L, 99999, client, Arrays.asList(secondaryClient, secondaryClient2), 1000D );

        System.out.println(account);






    }
}
