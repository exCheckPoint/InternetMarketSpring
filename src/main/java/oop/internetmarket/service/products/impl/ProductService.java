package oop.internetmarket.service.products.impl;

import oop.internetmarket.dao.products.intrfaces.IDaoProduct;
import oop.internetmarket.model.products.Product;
import oop.internetmarket.service.products.intrfaces.IProductService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 12.04.2017.
 */
public class ProductService implements IProductService {
    IDaoProduct iDaoProduct;

    public IDaoProduct getiDaoProduct() {
        return iDaoProduct;
    }

    public void setiDaoProduct(IDaoProduct iDaoProduct) {
        this.iDaoProduct = iDaoProduct;
    }

    public ProductService(){}

    public ProductService(IDaoProduct iDaoProduct){
        this.iDaoProduct=iDaoProduct;
    }

    public List<Product> getAll(){
        return iDaoProduct.getAll();
    }

    public Product getProduct(int code){
        return iDaoProduct.getProduct(code);
    }

    public void createProduct(Product product){
        iDaoProduct.createProduct(product);
    }

    public void updateProduct(Product product){
        iDaoProduct.updateProduct(product);
    }

    public void deleteProduct(int code){
        iDaoProduct.deleteProduct(code);
    }

    public void showAll(){
        iDaoProduct.showAll();
    }

    public void getIdOnNameProduct(String nameProduct){
        for(Product product:iDaoProduct.getAll()){
            if(product.getNameProduct().equals(nameProduct)){
                System.out.println("Product id:"+product.getCodeProduct()+" has name:"+nameProduct+".");
            }
        }
    }

    public void getPriceProductOnName(String nameProduct){
        for (Product product:iDaoProduct.getAll()){
            if (product.getNameProduct().equals(nameProduct)){
                System.out.println(nameProduct+" have price:"+product.getPriceProduct());
            }
        }
    }

    public int getSizeListProduct(){
        return iDaoProduct.getAll().size();
    }

    public List<String> getAllListOfProduct(){
        ArrayList<String> productList = new ArrayList<>();
        for (Product product : iDaoProduct.getAll()){
            productList.add(product.getNameProduct());
        }
        return productList;
    }
}
