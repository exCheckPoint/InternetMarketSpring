package oop.internetmarket.model.bill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 12.04.2017.
 */
public class BillsManager {
    List<Bill> bills=new ArrayList<Bill>();

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public BillsManager(){}

    public BillsManager(ArrayList<Bill> bills){
        this.bills=bills;
    }
}
