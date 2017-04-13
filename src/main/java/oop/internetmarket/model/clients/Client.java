package oop.internetmarket.model.clients;

/**
 * Created by Admin on 11.04.2017.
 */
public class Client {
    int codeClient;
    String surnameClient;
    String nameClient;
    String middleNameClient;
    String adressClient;
    String phoneNumberClient;
    String emailClient;

    public Client(){}

    public Client(int codeClient, String surnameClient, String nameClient, String middleNameClient, String adressClient, String phoneNumberClient, String emailClient) {
        this.codeClient = codeClient;
        this.surnameClient = surnameClient;
        this.nameClient = nameClient;
        this.middleNameClient = middleNameClient;
        this.adressClient = adressClient;
        this.phoneNumberClient = phoneNumberClient;
        this.emailClient = emailClient;
    }

    public int getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public String getSurnameClient() {
        return surnameClient;
    }

    public void setSurnameClient(String surnameClient) {
        this.surnameClient = surnameClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getMiddleNameClient() {
        return middleNameClient;
    }

    public void setMiddleNameClient(String middleNameCleint) {
        this.middleNameClient = middleNameCleint;
    }

    public String getAdressClient() {
        return adressClient;
    }

    public void setAdressClient(String adressClient) {
        this.adressClient = adressClient;
    }

    public String getPhoneNumberClient() {
        return phoneNumberClient;
    }

    public void setPhoneNumberClient(String phoneNumberClient) {
        this.phoneNumberClient = phoneNumberClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getInfo() {
        return "Code Client: " + getCodeClient() + "\n" +
                "-------------------------------------\n" +
                "Surname Client: " + getSurnameClient() + "\n" +
                "Name Client: " + getNameClient() + "\n" +
                "Middle Name Client: " + getMiddleNameClient() + "\n" +
                "Adress Client: " + getAdressClient() + "\n" +
                "Phone Number Client: " + getPhoneNumberClient() + "\n" +
                "Email Client: " + getEmailClient() + "\n";
    }
}
