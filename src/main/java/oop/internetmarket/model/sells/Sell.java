package oop.internetmarket.model.sells;

/**
 * Created by Admin on 11.04.2017.
 */
public class Sell {
    private int codeSell;
    private String dateSell;
    private String dateReshpmen;
    private int number;

    public Sell(){}

    public Sell(int codeSell, String dateSell, String dateReshpmen, int number) {
        this.codeSell = codeSell;
        this.dateSell = dateSell;
        this.dateReshpmen = dateReshpmen;
        this.number = number;
    }

    public int getCodeSell() {
        return codeSell;
    }

    public void setCodeSell(int codeSell) {
        this.codeSell = codeSell;
    }

    public String getDateSell() {
        return dateSell;
    }

    public void setDateSell(String dateSell) {
        this.dateSell = dateSell;
    }

    public String getDateReshpmen() {
        return dateReshpmen;
    }

    public void setDateReshpmen(String dateReshpmen) {
        this.dateReshpmen = dateReshpmen;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getInfo(){
        return  "Number of purchases: "+getNumber()+"\n"+
                "Code Sell: "+getCodeSell()+"\n"+
                "Date Sell: "+getDateSell()+"\n"+
                "Date Reshpmen: "+getDateReshpmen()+"\n";
    }
}
