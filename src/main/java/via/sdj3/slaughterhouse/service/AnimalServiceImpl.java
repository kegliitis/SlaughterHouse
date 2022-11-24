package via.sdj3.slaughterhouse.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhouse.model.Animal;
import via.sdj3.slaughterhouse.model.AnimalType;
import via.sdj3.slaughterhouse.protobuf.animal.*;
import via.sdj3.slaughterhouse.repository.AnimalRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@GRpcService
public class AnimalServiceImpl extends AnimalServiceGrpc.AnimalServiceImplBase
{
    private EntityManagerFactory emf;
    private AnimalRepository animalRepository;
    public AnimalServiceImpl(AnimalRepository animalRepository)
    {
        this.animalRepository = animalRepository;
    }

    @Override
    public void getAnimal(GetAnimalRequest request, StreamObserver<GetAnimalResponse> responseObserver)
    {
           Optional<Animal> animal = animalRepository.findById(request.getAnimalId());
           Animal animalFound = animal.get();
           AnimalType animalType = new AnimalType();
           animalType.setId(animalFound.getAnimalType().getId());
           GetAnimalResponse.Builder builder = GetAnimalResponse.newBuilder();
           builder.setAnimalId(animalFound.getId());
           builder.setAnimalTypeId(animalType.getId());
           builder.setWeight(animalFound.getWeight());
           builder.setRegistrationDate(animalFound.getRegistrationDate());
           builder.setHealthy(animalFound.isHealthy());

           GetAnimalResponse response = builder.build();
           responseObserver.onNext(response);
           responseObserver.onCompleted();
      
    }

    @Override
    public void createAnimal(CreateAnimalRequest request, StreamObserver<CreateAnimalResponse> responseObserver)
    {
        Animal animal = new Animal();
        AnimalType animalType = new AnimalType();
        animalType.setId(request.getAnimalTypeId());
        animal.setAnimalType(animalType);
        animal.setWeight(request.getAnimalTypeId());
        animal.setRegistrationDate(request.getRegistrationDate());
        animal.setHealthy(request.getHealthy());
        Animal responseAnimal = animalRepository.save(animal);

        CreateAnimalResponse.Builder builder = CreateAnimalResponse.newBuilder();
        if(responseAnimal == null)
            builder.setConfirmation("Animal could not be created");
        else
            builder.setConfirmation("Animal created");

        CreateAnimalResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalIds(GetAnimalIdsRequest request, StreamObserver<GetAnimalIdsResponse> responseObserver)
    {
        EntityManager entityManager = emf.createEntityManager();
        Query query = entityManager.createQuery(" SELECT id FROM Animal WHERE id IN (SELECT DISTINCT animal.id FROM AnimalPart WHERE Product.id =:productId) ");
        query.setParameter("productId", request.getProductId());
        List<Integer> list = query.getResultList();
        
        GetAnimalIdsResponse.Builder builder = GetAnimalIdsResponse.newBuilder();

        for (int id: list)
        {
            builder.addAnimalIds(id);
        }

        GetAnimalIdsResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
