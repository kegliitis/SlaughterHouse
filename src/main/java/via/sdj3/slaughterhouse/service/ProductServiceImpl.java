package via.sdj3.slaughterhouse.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhouse.model.Product;
import via.sdj3.slaughterhouse.model.Tray;
import via.sdj3.slaughterhouse.protobuf.product.*;
import via.sdj3.slaughterhouse.repository.ProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@GRpcService
public class ProductServiceImpl extends ProductServiceGrpc.ProductServiceImplBase {

    private EntityManagerFactory emf;

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public void getProduct(GetProductRequest request, StreamObserver<GetProductResponse> responseObserver)
    {
        Optional<Product> product = productRepository.findById(request.getId());
        Product productFound = product.get();
        Tray tray = new Tray();
        tray.setId(productFound.getTray().getId());
        GetProductResponse.Builder builder = GetProductResponse.newBuilder();
        builder.setId(productFound.getId());
        builder.setName(productFound.getName());
        builder.setDescription(productFound.getDescription());
        builder.setTrayId(tray.getId());

        GetProductResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void createProduct(CreateProductRequest request, StreamObserver<CreateProductResponse> responseObserver)
    {
        Product product = new Product();
        Tray tray = new Tray();
        tray.setId(request.getTrayId());
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setTray(tray);
        Product responseProduct = productRepository.save(product);

        CreateProductResponse.Builder builder = CreateProductResponse.newBuilder();
        if(responseProduct == null)
            builder.setConfirmation("Product could not be created");
        else
            builder.setConfirmation("Product created");

        CreateProductResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void getProductIds(GetProductIdsRequest request, StreamObserver<GetProductsIdsResponse> responseObserver)
    {
        EntityManager entityManager = emf.createEntityManager();
        Query query = entityManager.createQuery("SELECT id FROM Product WHERE id IN (SELECT DISTINCT product.id FROM AnimalPart WHERE Animal.id =:animalId)");
        query.setParameter("animalId",request.getAnimalId());
        List<Integer> list = query.getResultList();

        GetProductsIdsResponse.Builder builder = GetProductsIdsResponse.newBuilder();

        for(int id: list)
        {
            builder.addProductIds(id);
        }

        GetProductsIdsResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
