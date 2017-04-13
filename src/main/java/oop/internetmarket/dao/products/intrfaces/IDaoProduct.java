package oop.internetmarket.dao.products.intrfaces;

import oop.internetmarket.model.products.Product;

import java.util.List;

/**
 * Created by Admin on 11.04.2017.
 */
public interface IDaoProduct {
    List<Product> getAll();
    Product getProduct(int code);
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int code);
    void showAll();
}
