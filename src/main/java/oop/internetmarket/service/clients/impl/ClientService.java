package oop.internetmarket.service.clients.impl;

import oop.internetmarket.service.clients.intrfaces.IClientService;
import oop.internetmarket.dao.clients.intrfaces.IDaoClient;
import oop.internetmarket.model.clients.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 12.04.2017.
 */
public class ClientService implements IClientService {
    IDaoClient iDaoClient;

    public ClientService(){}

    public ClientService (IDaoClient iDaoClient){
        this.iDaoClient=iDaoClient;
    }

    public IDaoClient getiDaoClient() {
        return iDaoClient;
    }

    public void setiDaoClient(IDaoClient iDaoClient) {
        this.iDaoClient = iDaoClient;
    }

    public List<Client> getAll(){
        return iDaoClient.getAll();
    }

    public Client getClient(int code){
        return iDaoClient.getClient(code);
    }

    public void createClient(Client client){
        iDaoClient.createClient(client);
    }

    public void updateClient(Client client){
        iDaoClient.updateClient(client);
    }

    public void deleteClient(int code){
        iDaoClient.deleteClient(code);
    }

    public void showAll(){
        iDaoClient.showAll();
    }

    public void getPhoneNumberClientOnId(String phoneNumberClient){
        for (Client client:iDaoClient.getAll()){
            if(client.getPhoneNumberClient().equals(phoneNumberClient)){
                System.out.println("Client Id:"+client.getCodeClient()+", have phone number:"+phoneNumberClient+".");
            }
        }
    }

    public int getSizeListClient(){
        return iDaoClient.getAll().size();
    }

    public void getEmailCilentOnId(String emailClient){
        for (Client client:iDaoClient.getAll()){
            if(client.getEmailClient().equals(emailClient)){
                System.out.println("Client Id:"+client.getCodeClient()+", have email:"+emailClient+".");
            }
        }

    }

    public void getAdressClientOnSurnameAndName(String surnameClient,String nameClient){
        for (Client client:iDaoClient.getAll()){
            if (client.getSurnameClient().equals(surnameClient)&&client.getNameClient().equals(nameClient)){
                System.out.println("Client: "+surnameClient+nameClient+" has as adress: "+client.getAdressClient());
            }
        }
    }

    public List<String> getAllListForNumberPhoneClient(){
        ArrayList<String> phoneNumberList=new ArrayList<>();
        for (Client client : iDaoClient.getAll()){
            phoneNumberList.add(client.getPhoneNumberClient());
        }
        return phoneNumberList;
    }

    public List<String> getAllListForEmailClient(){
        ArrayList<String> emailList=new ArrayList<>();
        for(Client client : iDaoClient.getAll()){
            emailList.add(client.getEmailClient());
        }
        return emailList;
    }
}
