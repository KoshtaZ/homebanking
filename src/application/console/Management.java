package src.application.console;

import src.model.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Management {
    public static void createAccount(){
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Insira os dados dos clientes: ");
        System.out.print("ID: ");
        Long id = scan.nextLong();
        System.out.print("NIF: ");
        int nif = scan.nextInt();
        System.out.print("Password: ");
        int password = scan.nextInt();
        System.out.print("Name: ");
        String name = scan.nextLine();
        scan.nextLine();
        System.out.print("Birthday: (dd/MM/yyyy) ");
        LocalDate birthday = LocalDate.parse(scan.next(), fmt);
        System.out.print("Telephone: ");
        int telephone = scan.nextInt();
        System.out.print("Cellphone: ");
        long cellphone = scan.nextLong();
        System.out.print("Email: ");
        scan.nextLine();
        String email = scan.nextLine();
        System.out.print("Profession: ");
        String profession = scan.nextLine();
        Client client = new Client(id, nif, password, name, birthday, telephone, cellphone, email,profession);

    }
    public static void updateData(){

    }
    public static void deleteAccount(){

    }
}
