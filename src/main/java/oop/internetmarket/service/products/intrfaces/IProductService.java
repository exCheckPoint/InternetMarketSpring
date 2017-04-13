package oop.internetmarket.service.products.intrfaces;

import oop.internetmarket.model.products.Product;

import java.util.List;

/**
 * Created by Admin on 12.04.2017.
 */
public interface IProductService {
    List<Product> getAll();
    Product getProduct(int code);
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int code);
    void showAll();
    void getIdOnNameProduct(String nameProduct);
    void getPriceProductOnName(String nameProduct);
    int getSizeListProduct();
    List<String> getAllListOfProduct();
}
