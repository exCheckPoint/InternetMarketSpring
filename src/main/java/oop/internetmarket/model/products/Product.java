package oop.internetmarket.model.products;

/**
 * Created by Admin on 11.04.2017.
 */
public class Product {
    private int codeProduct;
    private String nameProduct;
    private double priceProduct;

    public Product(){}

    public Product(int codeProduct, String nameProduct, double priceProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getInfo(){
        return "Code Product: "+getCodeProduct()+"\n"+
                "Name Product: "+getNameProduct()+"\n"+
                "Price Product: "+getPriceProduct()+"\n";
    }
}
