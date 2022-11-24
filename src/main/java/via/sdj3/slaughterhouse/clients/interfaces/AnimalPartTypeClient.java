package via.sdj3.slaughterhouse.clients.interfaces;

import via.sdj3.slaughterhouse.model.AnimalPartType;

public interface AnimalPartTypeClient
{
    String createAnimalPartType(AnimalPartType animalPartType);
    AnimalPartType getAnimalPartType(int id);
}
