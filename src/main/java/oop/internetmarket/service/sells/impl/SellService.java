package oop.internetmarket.service.sells.impl;

import oop.internetmarket.dao.sells.intrfaces.IDaoSell;
import oop.internetmarket.model.sells.Sell;
import oop.internetmarket.service.sells.intrfaces.ISellService;
import java.util.List;

/**
 * Created by Admin on 12.04.2017.
 */
public class SellService implements ISellService {
    IDaoSell iDaoSell;

    public IDaoSell getiDaoSell() {
        return iDaoSell;
    }

    public void setiDaoSell(IDaoSell iDaoSell) {
        this.iDaoSell = iDaoSell;
    }

    public SellService(){}

    public SellService(IDaoSell iDaoSell){
        this.iDaoSell=iDaoSell;
    }

    public List<Sell> getAll(){
        return iDaoSell.getAll();
    }

    public Sell getSell(int code){
        return iDaoSell.getSell(code);
    }

    public void createSell(Sell sell){
        iDaoSell.createSell(sell);
    }

    public void updateSell(Sell sell){
        iDaoSell.updateSell(sell);
    }

    public void deleteSell(int code){
        iDaoSell.deleteSell(code);
    }

    public void showAll(){
        iDaoSell.showAll();
    }

    public void getDateSellOnId(int codeSell){
        for (Sell sell:iDaoSell.getAll()){
            if (sell.getCodeSell()==codeSell){
                System.out.println(codeSell+" - id, this sell have data sell:"+sell.getDateSell()+".");
            }
        }
    }

    public void getDateReshpmenOnId(int codeSell){
        for (Sell sell:iDaoSell.getAll()){
            if (sell.getCodeSell()==codeSell){
                System.out.println(codeSell+" - id, this sell have data reshpmen:"+sell.getDateReshpmen()+".");
            }
        }
    }

    public int getSizeSellList(){return iDaoSell.getAll().size();}

    public void getNumberSellOnDate(String dateSell){
        for (Sell sell:iDaoSell.getAll()){
            if (sell.getDateSell().equals(dateSell)){
                System.out.println("In "+dateSell+" internet market had "+iDaoSell.getAll().size()+" sells.");
            }
        }
    }
}
