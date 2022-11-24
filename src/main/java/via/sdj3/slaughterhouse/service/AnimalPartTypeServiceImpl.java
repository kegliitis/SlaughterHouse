package via.sdj3.slaughterhouse.service;

import io.grpc.stub.StreamObserver;
import via.sdj3.slaughterhouse.model.AnimalPartType;
import via.sdj3.slaughterhouse.protobuf.animalparttype.*;
import via.sdj3.slaughterhouse.repository.AnimalPartTypeRepository;

import java.util.Optional;

public class AnimalPartTypeServiceImpl extends AnimalPartTypeServiceGrpc.AnimalPartTypeServiceImplBase
{

    private AnimalPartTypeRepository animalPartTypeRepository;

    public AnimalPartTypeServiceImpl(AnimalPartTypeRepository animalPartTypeRepository)
    {
        this.animalPartTypeRepository = animalPartTypeRepository;
    }

    @Override
    public void getAnimalPartType(GetAnimalPartTypeRequest request, StreamObserver<GetAnimalPartTypeResponse> responseObserver)
    {
        Optional<AnimalPartType> animalPartType = animalPartTypeRepository.findById(request.getId());

        GetAnimalPartTypeResponse.Builder builder = GetAnimalPartTypeResponse.newBuilder();

        builder.setId(animalPartType.get().getId());
        builder.setName(animalPartType.get().getName());
        builder.setDescription(animalPartType.get().getDescription());

        GetAnimalPartTypeResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createAnimalPartType(CreateAnimalPartTypeRequest request, StreamObserver<CreateAnimalPartTypeResponse> responseObserver)
    {
        AnimalPartType animalPartType = new AnimalPartType();
        animalPartType.setName(request.getName());
        animalPartType.setDescription(request.getDescription());

        AnimalPartType responseAnimalPartType = animalPartTypeRepository.save(animalPartType);

        CreateAnimalPartTypeResponse.Builder builder = CreateAnimalPartTypeResponse.newBuilder();

        if(responseAnimalPartType == null)
            builder.setConfirmation("Animal part type could not be created");
        else
            builder.setConfirmation("Animal part type created");

        CreateAnimalPartTypeResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
