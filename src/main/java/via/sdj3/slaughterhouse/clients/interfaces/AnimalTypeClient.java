package via.sdj3.slaughterhouse.clients.interfaces;

import via.sdj3.slaughterhouse.model.AnimalType;

public interface AnimalTypeClient
{
    String createAnimalType(AnimalType animalType);
    AnimalType getAnimalType(int id);
}
