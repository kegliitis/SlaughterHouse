package via.sdj3.slaughterhouse.clients.interfaces;

import via.sdj3.slaughterhouse.model.AnimalPart;

public interface AnimalPartClient
{
    String createAnimalPart(AnimalPart animalPart);
    AnimalPart getAnimalPart(int animalPartId);
}
