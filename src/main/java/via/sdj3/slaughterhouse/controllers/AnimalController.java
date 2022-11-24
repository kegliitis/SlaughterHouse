package via.sdj3.slaughterhouse.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.clients.implementations.AnimalClientImpl;
import via.sdj3.slaughterhouse.clients.interfaces.AnimalClient;
import via.sdj3.slaughterhouse.model.Animal;

import java.util.List;

@RestController
@RequestMapping("/")
public class AnimalController
{
    private Logger logger = LoggerFactory.getLogger(AnimalController.class);
    private AnimalClient animalClient;

    public AnimalController()
    {
        this.animalClient = new AnimalClientImpl();
    }

    @GetMapping(value="/animals/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Integer>> getAllAnimalsInProduct(@PathVariable("id") int id)
    {
        try
        {
            List<Integer> animals = animalClient.getAnimals(id);
                return new ResponseEntity<List<Integer>>(animals, HttpStatus.OK);

        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/animals")
    public ResponseEntity<String> createAnimal(@RequestBody Animal animal)
    {
        try
        {
            String response = animalClient.createAnimal(animal);
                return new ResponseEntity<String>(response, HttpStatus.OK);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping( value = "/animal/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAnimalById(@PathVariable("id") int id)
    {
        try
        {
            Animal animal = animalClient.getAnimal(id);
            if(animal != null)
                return new ResponseEntity<Object>(animal, HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
}
