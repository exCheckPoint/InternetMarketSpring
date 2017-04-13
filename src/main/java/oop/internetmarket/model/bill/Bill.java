package oop.internetmarket.model.bill;

import oop.internetmarket.model.products.Product;
import oop.internetmarket.model.sells.Sell;
import oop.internetmarket.model.clients.Client;

/**
 * Created by Admin on 11.04.2017.
 */
public class Bill {
    int codeBill;
    Client client;
    Product product;
    Sell sell;

    public Bill(){}

    public Bill(int codeBill, Client clients, Product products, Sell sells) {
        this.codeBill = codeBill;
        this.client = clients;
        this.product = products;
        this.sell = sells;
    }

    public int getCodeBill() {
        return codeBill;
    }

    public void setCodeBill(int codeBill) {
        this.codeBill = codeBill;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }

    public String getInfo(){
        return "Id Code BillService: "+getCodeBill()+"\n"+
                client.getInfo()+ product.getInfo()+ sell.getInfo();
                }
}
