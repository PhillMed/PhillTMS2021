package shop;

import shop.model.Product;
import shop.model.Shop;
import shop.service.IShopService;
import shop.service.ShopServiceImpl;

import static shop.util.Utils.*;

public class MainShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        IShopService service = new ShopServiceImpl(shop);

        System.out.println("1)" + service.getAllProducts());

        Product product1 = new Product(10, "apple", 70);
        Product product2 = new Product(20, "orange", 150);
        Product product3 = new Product(35, "carrot", 100);
        try {
            service.addProduct(product1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            service.addProduct(product2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            service.addProduct(product3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("2)" + service.getAllProducts());
        service.deleteProduct(20);
        service.deleteProduct(25);
        System.out.println("3)" + service.getAllProducts());

        Product product = service.getProductById(5);
        product.setName(readStringFromConsole("Введите новое наименование товара: "));
        product.setPrice(readIntFromConsole("Введите новую цену товара:", 1000));
        service.editProduct(product);
        service.editProduct(new Product(10, "juice", 170));
        System.out.println("4)" + service.getAllProducts());
        System.out.println();
    }
}
