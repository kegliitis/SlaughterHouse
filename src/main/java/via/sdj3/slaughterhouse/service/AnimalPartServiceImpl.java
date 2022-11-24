package via.sdj3.slaughterhouse.service;

import io.grpc.stub.StreamObserver;
import via.sdj3.slaughterhouse.model.*;
import via.sdj3.slaughterhouse.model.AnimalPart;
import via.sdj3.slaughterhouse.protobuf.animal.GetAnimalResponse;
import via.sdj3.slaughterhouse.protobuf.animalpart.*;
import via.sdj3.slaughterhouse.repository.AnimalPartRepository;

import java.util.Optional;

public class AnimalPartServiceImpl extends AnimalPartServiceGrpc.AnimalPartServiceImplBase
{
    private AnimalPartRepository animalPartRepository;

    public AnimalPartServiceImpl(AnimalPartRepository animalPartRepository)
    {
        this.animalPartRepository = animalPartRepository;
    }

    @Override
    public void getAnimalPart(GetAnimalPartRequest request, StreamObserver<GetAnimalPartResponse> responseObserver)
    {
        Optional<AnimalPart> animalPart = animalPartRepository.findById(request.getId());

        GetAnimalPartResponse.Builder builder = GetAnimalPartResponse.newBuilder();
        builder.setAnimalId(animalPart.get().getId());
        builder.setWeight(animalPart.get().getWeight());
        builder.setAnimalId(animalPart.get().getAnimal().getId());
        GetAnimalPartResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createAnimalPart(CreateAnimalPartRequest request, StreamObserver<CreateAnimalPartResponse> responseObserver)
    {
        AnimalPart animalPart = new AnimalPart();
        Animal animal = new Animal();
        AnimalPartType animalPartType = new AnimalPartType();
        animalPartType.setId(request.getAnimalPartTypeId());
        Tray tray = new Tray();
        Product product = new Product();
        tray.setId(request.getTrayId());
        animal.setId(request.getAnimalId());
        animalPart.setWeight(request.getWeight());
        animalPart.setAnimal(animal);
        animalPart.setAnimalPartType(animalPartType);
        animalPart.setTray(tray);
        animalPart.setProduct(product);
        AnimalPart responseAnimalPart = animalPartRepository.save(animalPart);

        CreateAnimalPartResponse.Builder builder = CreateAnimalPartResponse.newBuilder();
        if(responseAnimalPart == null)
            builder.setConfirmation("Animal part could not be created");
        else
            builder.setConfirmation("Animal part created");

        CreateAnimalPartResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
