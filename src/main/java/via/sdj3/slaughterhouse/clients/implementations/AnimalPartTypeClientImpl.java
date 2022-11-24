package via.sdj3.slaughterhouse.clients.implementations;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.slaughterhouse.clients.interfaces.AnimalPartTypeClient;
import via.sdj3.slaughterhouse.model.AnimalPartType;
import via.sdj3.slaughterhouse.protobuf.animalparttype.*;

public class AnimalPartTypeClientImpl implements AnimalPartTypeClient
{
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8089).usePlaintext().build();
    private AnimalPartTypeServiceGrpc.AnimalPartTypeServiceBlockingStub blockingStub = AnimalPartTypeServiceGrpc.newBlockingStub(channel);
    @Override
    public String createAnimalPartType(AnimalPartType animalPartType)
    {
        CreateAnimalPartTypeRequest input = CreateAnimalPartTypeRequest.newBuilder()
                .setName(animalPartType.getName())
                .setDescription(animalPartType.getDescription())
                .build();

        CreateAnimalPartTypeResponse response = blockingStub.createAnimalPartType(input);
        return response.getConfirmation();
    }

    @Override
    public AnimalPartType getAnimalPartType(int id)
    {
        GetAnimalPartTypeRequest input = GetAnimalPartTypeRequest.newBuilder().setId(id).build();

        GetAnimalPartTypeResponse response = blockingStub.getAnimalPartType(input);
        AnimalPartType animalPartType = new AnimalPartType();
        animalPartType.setId(response.getId());
        animalPartType.setName(response.getName());
        animalPartType.setDescription(response.getDescription());
        return animalPartType;
    }
}
