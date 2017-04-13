package oop.internetmarket.dao.clients.intrfaces;

import oop.internetmarket.model.clients.Client;

import java.util.List;

/**
 * Created by Admin on 11.04.2017.
 */
public interface IDaoClient {
    List<Client> getAll();
    Client getClient(int code);
    void createClient(Client client);
    void updateClient(Client client);
    void deleteClient(int code);
    void showAll();

}
