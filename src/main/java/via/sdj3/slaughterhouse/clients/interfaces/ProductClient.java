package via.sdj3.slaughterhouse.clients.interfaces;

import via.sdj3.slaughterhouse.model.Product;

import java.util.List;

public interface ProductClient {
    String createProduct(Product product);

    Product getProduct(int productId);

    List<Integer> getProducts(int animalId);
}
