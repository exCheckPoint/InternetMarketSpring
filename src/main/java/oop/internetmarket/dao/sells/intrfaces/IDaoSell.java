package oop.internetmarket.dao.sells.intrfaces;

import oop.internetmarket.model.sells.Sell;

import java.util.List;

/**
 * Created by Admin on 11.04.2017.
 */
public interface IDaoSell {
    List<Sell> getAll();
    Sell getSell(int code);
    void createSell(Sell sell);
    void updateSell(Sell sell);
    void deleteSell(int code);
    void showAll();
}
