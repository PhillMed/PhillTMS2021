package shop.service;

import shop.model.Product;

import java.util.List;

public interface IShopService {
    void addProduct(Product product) throws Exception;
    Product getProductById(int id);
    List<Product> getAllProducts();
    void editProduct(Product product);
    void deleteProduct(int id);

    List<Product> sortByDate();
}
