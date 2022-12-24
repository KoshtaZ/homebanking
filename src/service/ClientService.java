package src.service;

import src.model.Client;

import java.util.List;


public interface ClientService {

    Client save(Client client);
    Client update(Client client);
    List<Client> getAll();
    Client getByID(Long id);
    Client deleteByID(Long id);
    Client getByNif(Integer nif);
    Client deleteByNif(Integer nif);
    Client findBy(Integer nif);

}
