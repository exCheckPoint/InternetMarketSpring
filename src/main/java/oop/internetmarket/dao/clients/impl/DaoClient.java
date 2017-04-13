package oop.internetmarket.dao.clients.impl;

import oop.internetmarket.dao.clients.intrfaces.IDaoClient;
import oop.internetmarket.model.clients.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 11.04.2017.
 */
public class DaoClient implements IDaoClient {
    public List<Client> clients = new ArrayList<>();

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public DaoClient(List<Client> clients){
        this.clients=clients;
    }

    public DaoClient(){}

    public List<Client> getAll(){
        return clients;
    }

    public Client getClient(int code){
        Client result = null;
        for (Client item : clients){
            if(item.getCodeClient() == code){
                result = new Client(
                        item.getCodeClient(),
                        item.getSurnameClient(),
                        item.getNameClient(),
                        item.getMiddleNameClient(),
                        item.getAdressClient(),
                        item.getPhoneNumberClient(),
                        item.getEmailClient()
                );
            }
        }
        return result;
    }

    public void createClient(Client client){
        clients.add(client);
    }

    public void updateClient(Client client) {
        Client updateClients = null;
        for (Client item : clients) {
            if (item.getCodeClient() == client.getCodeClient()) {
                updateClients = item;
                break;
            }
        }
        updateClients = client;

    }

    public void deleteClient(int code) {

        boolean a = false;
        a = clients.removeIf(sells -> sells.getCodeClient() == code);
        if (a == true) {
            clients.remove(getClient(code));
        }
    }

    public void showAll() {
        for (Client customer1 : clients) {
            System.out.println(customer1.getInfo());
        }
    }
}
