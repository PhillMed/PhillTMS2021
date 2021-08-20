package shop.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;
    public  List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<>();
        }
        return products;
    }
}
