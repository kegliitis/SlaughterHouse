package via.sdj3.slaughterhouse.clients.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.slaughterhouse.clients.interfaces.ProductClient;
import via.sdj3.slaughterhouse.model.Product;
import via.sdj3.slaughterhouse.model.Tray;
import via.sdj3.slaughterhouse.protobuf.product.*;

import java.util.List;

public class ProductClientImpl implements ProductClient {

    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8089).usePlaintext().build();

    private ProductServiceGrpc.ProductServiceBlockingStub blockingStub = ProductServiceGrpc.newBlockingStub(channel);
    @Override
    public String createProduct(Product product) {
        CreateProductRequest input = CreateProductRequest.newBuilder()
                .setName(product.getName())
                .setDescription(product.getDescription())
                .setTrayId(product.getTray().getId())
                .build();

        CreateProductResponse response = blockingStub.createProduct(input);
        return response.getConfirmation();
    }

    @Override
    public Product getProduct(int productId) {
        GetProductRequest input = GetProductRequest.newBuilder().setId(productId).build();

        GetProductResponse response = blockingStub.getProduct(input);
        Tray tray = new Tray();
        tray.setId(response.getId());
        Product product = new Product(response.getId(),response.getName(), response.getDescription(),tray);
        return product;
    }

    @Override
    public List<Integer> getProducts(int animalId) {
        GetProductIdsRequest input = GetProductIdsRequest.newBuilder().setAnimalId(animalId).build();
        GetProductsIdsResponse response = blockingStub.getProductIds(input);

        return response.getProductIdsList();
    }
}
