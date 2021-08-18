package shop.service;

import lombok.AllArgsConstructor;
import shop.model.Product;
import shop.model.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
public class ShopServiceImpl implements IShopService {
    private final Shop shop;

    @Override
    public void addProduct(Product product) throws Exception {
        List<Product> list = getAllProducts();
        boolean isIdPresent = list.stream()
                .anyMatch(product1 -> product1.getId() == product.getId());
        if (!isIdPresent) {
            list.add(product);
        } else {
            throw new Exception("Товар с id=" + product.getId() + " уже существует");
        }
    }

    @Override
    public Product getProductById(int id) {
        Product product = null;
        try {
            product = findProductById(id);
        } catch (NoSuchElementException e) {
            e.getMessage();
        }
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return shop.getProducts();
    }

    @Override
    public void editProduct(Product product) {
        Product sourceProduct = findProductById(product.getId());
        sourceProduct.setName(product.getName());
        sourceProduct.setPrice(product.getPrice());
    }

    @Override
    public void deleteProduct(int id) {
        try {
            Product product = findProductById(id);

            List<Product> productList = getAllProducts();
            productList.remove(product);
            System.out.println(product + " - deleted");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Product> sortByDate() {
        List<Product> revList = new ArrayList<>(getAllProducts());
        Collections.reverse(revList);
        return revList;
    }

    private Product findProductById(int id) throws NoSuchElementException {
        List<Product> productList = getAllProducts();
        return productList.stream()
                .filter(product -> product.getId() == id)
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("Product with id: " + id + " not found"));
    }
}
