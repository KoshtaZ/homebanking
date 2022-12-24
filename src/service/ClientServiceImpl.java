package src.service;

import src.model.Client;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientServiceImpl implements ClientService{

    private final int MIN_AGE = 18;
    List<Client> clients = new ArrayList<>();
    @Override
    public Client save(Client client) {
        LocalDate dateBirthday = client.getBirthday();
        if (dateBirthday != null){
            throw new RuntimeException("Date of birthday can't be null");
        }
        LocalDate now = LocalDate.now();
        int age = Period.between(dateBirthday, now).getYears();
        if(age >= MIN_AGE){
            save(client);

        }
        throw new RuntimeException("Customer is " + age + " years old. He must be >= " +MIN_AGE);
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return clients;
    }

    @Override
    public Client getByID(Long id) {
       List<String> names = new ArrayList<>();
        for (Client aux: clients){
            if (id.equals(aux.getId())){
                String name = aux.getName();
                names.add(name);
            }
        }
        return null;
    }

    @Override
    public Client deleteByID(Long id) {

        return null;
    }

    @Override
    public Client getByNif(Integer nif) {
        return null;
    }

    @Override
    public Client deleteByNif(Integer nif) {
        return null;
    }

    @Override
    public Client findBy(Integer nif) {
        return null;
    }
}
