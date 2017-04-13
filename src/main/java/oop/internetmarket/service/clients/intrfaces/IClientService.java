package oop.internetmarket.service.clients.intrfaces;

import oop.internetmarket.model.clients.Client;
import java.util.List;

/**
 * Created by Admin on 12.04.2017.
 */
public interface IClientService  {
    List<Client> getAll();
    Client getClient(int code);
    void createClient(Client client);
    void updateClient(Client client);
    void deleteClient(int code);
    void showAll();
    void getPhoneNumberClientOnId(String phoneNumberClient);
    int getSizeListClient();
    void getEmailCilentOnId(String emailClient);
    void getAdressClientOnSurnameAndName(String surnameClient,String nameClient);
    List<String> getAllListForNumberPhoneClient();
    List<String> getAllListForEmailClient();
}
