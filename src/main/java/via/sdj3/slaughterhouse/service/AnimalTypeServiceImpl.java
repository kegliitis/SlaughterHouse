package via.sdj3.slaughterhouse.service;

import io.grpc.stub.StreamObserver;
import via.sdj3.slaughterhouse.model.AnimalType;
import via.sdj3.slaughterhouse.protobuf.animalpart.*;
import via.sdj3.slaughterhouse.protobuf.animaltype.*;
import via.sdj3.slaughterhouse.repository.AnimalTypeRepository;

import java.util.Optional;

public class AnimalTypeServiceImpl extends AnimalTypeServiceGrpc.AnimalTypeServiceImplBase
{
    private AnimalTypeRepository animalTypeRepository;

    public AnimalTypeServiceImpl(AnimalTypeRepository animalTypeRepository)
    {
        this.animalTypeRepository = animalTypeRepository;
    }

    @Override
    public void getAnimalType(GetAnimalTypeRequest request, StreamObserver<GetAnimalTypeResponse> responseObserver)
    {
        Optional<AnimalType> animalType = animalTypeRepository.findById(request.getId());

        GetAnimalTypeResponse.Builder builder = GetAnimalTypeResponse.newBuilder();

        builder.setId(animalType.get().getId());
        builder.setName(animalType.get().getName());
        builder.setDescription(animalType.get().getDescription());

        GetAnimalTypeResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createAnimalType(CreateAnimalTypeRequest request, StreamObserver<CreateAnimalTypeResponse> responseObserver)
    {
        AnimalType animalType = new AnimalType();
        animalType.setName(request.getName());
        animalType.setDescription(request.getDescription());

        AnimalType responeAnimalType = animalTypeRepository.save(animalType);

        CreateAnimalTypeResponse.Builder builder = CreateAnimalTypeResponse.newBuilder();

        if(responeAnimalType == null)
            builder.setConfirmation("Animal type could not be created");
        else
            builder.setConfirmation("Animal type created");

        CreateAnimalTypeResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
