package via.sdj3.slaughterhouse.clients.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.slaughterhouse.clients.interfaces.AnimalTypeClient;
import via.sdj3.slaughterhouse.model.AnimalPartType;
import via.sdj3.slaughterhouse.model.AnimalType;
import via.sdj3.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest;
import via.sdj3.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse;
import via.sdj3.slaughterhouse.protobuf.animaltype.*;

public class AnimalTypeClientImpl implements AnimalTypeClient
{
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8089).usePlaintext().build();
    private AnimalTypeServiceGrpc.AnimalTypeServiceBlockingStub blockingStub = AnimalTypeServiceGrpc.newBlockingStub(channel);
    @Override
    public String createAnimalType(AnimalType animalType)
    {
        CreateAnimalTypeRequest input = CreateAnimalTypeRequest.newBuilder()
                .setName(animalType.getName())
                .setDescription(animalType.getDescription())
                .build();

        CreateAnimalTypeResponse response = blockingStub.createAnimalType(input);
        return response.getConfirmation();
    }

    @Override
    public AnimalType getAnimalType(int id)
    {
        GetAnimalTypeRequest input = GetAnimalTypeRequest.newBuilder().setId(id).build();

        GetAnimalTypeResponse response = blockingStub.getAnimalType(input);
        AnimalType animalType = new AnimalType();
        animalType.setId(response.getId());
        animalType.setName(response.getName());
        animalType.setDescription(response.getDescription());

        return animalType;
    }
}
