package oop.internetmarket.dao.products.impl;

import oop.internetmarket.dao.products.intrfaces.IDaoProduct;
import oop.internetmarket.model.products.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 11.04.2017.
 */
public class DaoProduct implements IDaoProduct {
    public List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public DaoProduct (List<Product> productList){
        this.productList=productList;
    }

    public List<Product> getAll(){return productList;}

    public Product getProduct(int code){
        Product result = null;
        for (Product item : productList){
            if (item.getCodeProduct() == code){
                result = new Product(
                item.getCodeProduct(),
                item.getNameProduct(),
                item.getPriceProduct());
            }
        }
        return result;
    }

    public void createProduct(Product product){
        productList.add(product);
    }

    public void updateProduct(Product product){
        Product updateProduct = null;
        for (Product item : productList){
            if(item.getCodeProduct() == product.getCodeProduct()){
               updateProduct = item;
               break;
            }
        }
        updateProduct=product;
    }

    public void deleteProduct(int code){
        boolean a = false;
        a=productList.removeIf(sell -> sell.getCodeProduct()==code);
        if (a==true){
            productList.remove(getProduct(code));
        }
    }

    public void showAll(){
        for (Product product1:productList){
            System.out.println(product1.getInfo());
        }
    }
}
