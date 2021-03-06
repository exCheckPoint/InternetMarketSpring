package oop.internetmarket.dao.bill.intrfaces;

import oop.internetmarket.model.bill.Bill;

import java.util.List;

/**
 * Created by Admin on 11.04.2017.
 */
public interface IDaoBill {
    List<Bill> getAll();
    Bill getBill(int code);
    void createBill(Bill bill);
    void updateBill(Bill bill);
    void deleteBill(int code);
    void showAll();
}
