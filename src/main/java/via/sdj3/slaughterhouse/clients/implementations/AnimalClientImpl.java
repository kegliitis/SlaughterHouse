package via.sdj3.slaughterhouse.clients.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.slaughterhouse.clients.interfaces.AnimalClient;
import via.sdj3.slaughterhouse.model.Animal;
import via.sdj3.slaughterhouse.model.AnimalType;
import via.sdj3.slaughterhouse.protobuf.animal.*;

import java.util.List;

public class AnimalClientImpl implements AnimalClient
{

    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8089).usePlaintext().build();
    private AnimalServiceGrpc.AnimalServiceBlockingStub blockingStub = AnimalServiceGrpc.newBlockingStub(channel);

    @Override
    public String createAnimal(Animal animal)
    {
        CreateAnimalRequest input = CreateAnimalRequest.newBuilder()
                .setAnimalTypeId(animal.getAnimalType().getId())
                .setWeight(animal.getWeight())
                .setRegistrationDate(animal.getRegistrationDate())
                .setHealthy(animal.isHealthy())
                .build();

        CreateAnimalResponse response = blockingStub.createAnimal(input);
        return response.getConfirmation();
    }

    @Override
    public Animal getAnimal(int animalId)
    {
        GetAnimalRequest input = GetAnimalRequest.newBuilder().setAnimalId(animalId).build();

        GetAnimalResponse response = blockingStub.getAnimal(input);
        AnimalType animalType = new AnimalType();
        animalType.setId(response.getAnimalTypeId());
        Animal animal = new Animal(response.getAnimalId(), animalType, response.getWeight(), response.getRegistrationDate(), response.getHealthy());
        return animal;
    }

    @Override
    public List<Integer> getAnimals(int productId)
    {
        GetAnimalIdsRequest input = GetAnimalIdsRequest.newBuilder().setProductId(productId).build();
        GetAnimalIdsResponse response = blockingStub.getAnimalIds(input);

        return response.getAnimalIdsList();
    }
}
