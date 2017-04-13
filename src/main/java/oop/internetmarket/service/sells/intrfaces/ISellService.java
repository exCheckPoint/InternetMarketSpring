package oop.internetmarket.service.sells.intrfaces;

import oop.internetmarket.model.sells.Sell;

import java.util.List;

/**
 * Created by Admin on 12.04.2017.
 */
public interface ISellService {
    List<Sell> getAll();
    Sell getSell(int code);
    void createSell(Sell sell);
    void updateSell(Sell sell);
    void deleteSell(int code);
    void showAll();
    void getDateSellOnId(int codeSell);
    void getDateReshpmenOnId(int codeSell);
    int getSizeSellList();
    void getNumberSellOnDate(String dateSell);
}
