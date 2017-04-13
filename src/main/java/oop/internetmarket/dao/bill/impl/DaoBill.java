package oop.internetmarket.dao.bill.impl;

import oop.internetmarket.model.bill.Bill;
import oop.internetmarket.dao.bill.intrfaces.IDaoBill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 11.04.2017.
 */
public class DaoBill implements IDaoBill {
    public List<Bill> billList= new ArrayList<>();

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public DaoBill(List<Bill> billList){
        this.billList=billList;
    }

    public DaoBill(){}

    public List<Bill> getAll(){
        return billList;
    }

    public Bill getBill(int code){
        Bill result = null;
        for (Bill item:billList){
            if (item.getCodeBill()==code){
                result=new Bill(
                        item.getCodeBill(),
                        item.getClient(),
                        item.getProduct(),
                        item.getSell());
            }
        }
        return result;
    }

    public void createBill(Bill bill){
        billList.add(bill);
    }

    public void updateBill(Bill bill){
        Bill updateBill = null;
        for (Bill item:billList){
            if (item.getCodeBill()==bill.getCodeBill()){
                updateBill = item;
                break;
            }
        }
        updateBill=bill;
    }

    public void deleteBill(int code){
        boolean f =false;
        f=billList.removeIf(sell -> sell.getCodeBill()==code);
        if (f=true){
            billList.remove(getBill(code));
        }
    }

    public void showAll(){
        for (Bill item : billList){
            System.out.println(item.getInfo());
        }
    }
}
