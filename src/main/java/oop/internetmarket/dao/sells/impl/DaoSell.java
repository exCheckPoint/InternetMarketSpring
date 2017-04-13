package oop.internetmarket.dao.sells.impl;

import oop.internetmarket.dao.sells.intrfaces.IDaoSell;
import oop.internetmarket.model.sells.Sell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 11.04.2017.
 */
public class DaoSell implements IDaoSell {
    List<Sell> sellList = new ArrayList<Sell>();

    public List<Sell> getSellList() {
        return sellList;
    }

    public void setSellList(List<Sell> sellList) {
        this.sellList = sellList;
    }

    public DaoSell(List<Sell> sellList){
        this.sellList=sellList;
    }

    public DaoSell(){}

    public List<Sell> getAll(){
        return sellList;
    }

    public Sell getSell(int code){
        Sell result = null;
        for (Sell item:sellList){
            if (item.getCodeSell()==code){
                result = new Sell(
                item.getCodeSell(),
                item.getDateReshpmen(),
                item.getDateSell(),
                item.getNumber());
            }
        }
        return result;
    }

    public void createSell(Sell sell){
        sellList.add(sell);
    }

    public void updateSell(Sell sell){
        Sell updateSell = null;
        for (Sell item : sellList){
            if (item.getCodeSell()==sell.getCodeSell()){
                updateSell = item;
                break;
            }
        }
        updateSell=sell;
    }

    public void deleteSell(int code) {
        boolean a = false;
        a = sellList.removeIf(sell -> sell.getCodeSell() == code);
        if (a == true) {
            sellList.remove(getSell(code));
        }
    }

        public void showAll(){
            for(Sell sell1:sellList){
                System.out.println(sell1.getInfo());
            }
    }
}

