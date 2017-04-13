package oop.internetmarket;

import oop.internetmarket.model.products.Product;
import oop.internetmarket.model.sells.Sell;
import oop.internetmarket.service.bill.impl.BillService;
import oop.internetmarket.service.clients.impl.ClientService;
import oop.internetmarket.service.products.impl.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import oop.internetmarket.model.bill.Bill;
import oop.internetmarket.model.clients.Client;
import oop.internetmarket.service.sells.impl.SellService;

/**
 * Created by Admin on 13.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("service/springContext.xml");

        ClientService clientService = (ClientService) applicationContext.getBean("serviceClientContext");
        Client client = new Client(11,"Koval'chuck","Artur","Andriyovych","Kremenets","+380654863578","koval'chuck@gmail.com");
        clientService.createClient(client);
        System.out.println(clientService.getClient(7));
        System.out.println(clientService.getAllListForNumberPhoneClient());
        System.out.println(clientService.getSizeListClient());
        clientService.getEmailCilentOnId("yulka001@fzvz.com");

        ProductService productService = (ProductService) applicationContext.getBean("serviceProductContext");
        Product product = new Product(11,"MacBook Air 15",125000);
        productService.createProduct(product);
        System.out.println(productService.getAll());
        System.out.println(productService.getAllListOfProduct());
        System.out.println(productService.getSizeListProduct());
        productService.getPriceProductOnName("Samsung UE-13");
        System.out.println(productService.getProduct(3));

        SellService sellService = (SellService) applicationContext.getBean("serviceSellContext");
        Sell sell=new Sell(11,"3.04.2017","7.04.2017",4);
        sellService.createSell(sell);
        System.out.println(sellService.getSell(5));
        sellService.deleteSell(7);
        System.out.println(sellService.getAll());
        System.out.println(sellService.getSizeSellList());
        sellService.getDateReshpmenOnId(4);
        sellService.getDateSellOnId(2);

        BillService billService = (BillService) applicationContext.getBean("serviceBillContext");
        Bill bill = new Bill(11,client,product,sell);
        billService.createBill(bill);
        System.out.println(billService.getBill(11));
        System.out.println(billService.getAll());

    }
}
