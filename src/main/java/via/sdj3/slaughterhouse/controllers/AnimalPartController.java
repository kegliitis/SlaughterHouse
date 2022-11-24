package via.sdj3.slaughterhouse.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.clients.implementations.AnimalPartClientImpl;
import via.sdj3.slaughterhouse.clients.interfaces.AnimalPartClient;
import via.sdj3.slaughterhouse.model.AnimalPart;
import via.sdj3.slaughterhouse.model.AnimalPartType;

@RestController
@RequestMapping("/")
public class AnimalPartController
{
    private Logger logger = LoggerFactory.getLogger(AnimalPartController.class);
    private AnimalPartClient animalPartClient;

    public AnimalPartController()
    {
        this.animalPartClient = new AnimalPartClientImpl();
    }

    @GetMapping(value = "/animalpart/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAnimalPart(@PathVariable("id") int id)
    {
        try
        {
            AnimalPart animalPart = animalPartClient.getAnimalPart(id);
            if(animalPart != null)
                return new ResponseEntity<Object>(animalPart, HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/animalpart/")
    public ResponseEntity<String> createAnimalPart(@RequestBody AnimalPart animalPart)
    {
        try
        {
            String response = animalPartClient.createAnimalPart(animalPart);
            return new ResponseEntity<String>(response, HttpStatus.OK);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }
}
