package oop.internetmarket.service.bill.impl;

import oop.internetmarket.dao.bill.intrfaces.IDaoBill;
import oop.internetmarket.model.bill.Bill;
import oop.internetmarket.service.bill.intrfaces.IBillService;
import java.util.List;

/**
 * Created by Admin on 12.04.2017.
 */
public class BillService implements IBillService{
    IDaoBill iDaoBill;

    public IDaoBill getiDaoBill() {
        return iDaoBill;
    }

    public void setiDaoBill(IDaoBill iDaoBill) {
        this.iDaoBill = iDaoBill;
    }

    public BillService(){}

    public BillService(IDaoBill iDaoBill){
        this.iDaoBill=iDaoBill;
    }

    public List<Bill> getAll(){
        return iDaoBill.getAll();
    }

    public Bill getBill(int code){
        return iDaoBill.getBill(code);
    }

    public void createBill(Bill bill){
        iDaoBill.createBill(bill);
    }

    public void updateBill(Bill bill){
        iDaoBill.updateBill(bill);
    }

    public void deleteBill(int code){
        iDaoBill.deleteBill(code);
    }

    public void showAll(){
        iDaoBill.showAll();
    }
}
