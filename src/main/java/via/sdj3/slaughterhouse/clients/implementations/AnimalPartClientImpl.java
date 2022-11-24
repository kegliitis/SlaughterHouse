package via.sdj3.slaughterhouse.clients.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.slaughterhouse.clients.interfaces.AnimalPartClient;
import via.sdj3.slaughterhouse.model.Animal;
import via.sdj3.slaughterhouse.model.AnimalPart;
import via.sdj3.slaughterhouse.protobuf.animal.AnimalServiceGrpc;
import via.sdj3.slaughterhouse.protobuf.animal.GetAnimalRequest;
import via.sdj3.slaughterhouse.protobuf.animalpart.*;

public class AnimalPartClientImpl implements AnimalPartClient
{
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8089).usePlaintext().build();
    private AnimalPartServiceGrpc.AnimalPartServiceBlockingStub blockingStub = AnimalPartServiceGrpc.newBlockingStub(channel);

    @Override
    public String createAnimalPart(AnimalPart animalPart)
    {
        CreateAnimalPartRequest input = CreateAnimalPartRequest.newBuilder()
                .setWeight(animalPart.getWeight())
                .setAnimalId(animalPart.getAnimal().getId())
                .setTrayId(animalPart.getTray().getId())
                .setAnimalPartTypeId(animalPart.getAnimalPartType().getId())
                .build();

        CreateAnimalPartResponse response = blockingStub.createAnimalPart(input);
        return response.getConfirmation();
    }

    @Override
    public AnimalPart getAnimalPart(int animalPartId)
    {
        GetAnimalPartRequest input = GetAnimalPartRequest.newBuilder().setId(animalPartId).build();

        GetAnimalPartResponse response = blockingStub.getAnimalPart(input);
        Animal animal = new Animal();
        animal.setId(response.getAnimalId());
        AnimalPart animalPart = new AnimalPart(response.getId(), response.getWeight(), animal);
        return animalPart;
    }
}
