package via.sdj3.slaughterhouse.clients.interfaces;

import via.sdj3.slaughterhouse.model.Animal;

import java.util.List;

public interface AnimalClient
{
    String createAnimal(Animal animal);
    Animal getAnimal(int animalId);
    List<Integer> getAnimals(int productId);
}
