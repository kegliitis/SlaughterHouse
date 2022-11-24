package via.sdj3.slaughterhouse.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import via.sdj3.slaughterhouse.clients.implementations.AnimalPartTypeClientImpl;
import via.sdj3.slaughterhouse.clients.interfaces.AnimalPartTypeClient;
import via.sdj3.slaughterhouse.model.AnimalPartType;

@RestController
@RequestMapping("/")
public class AnimalPartTypeController
{
    private Logger logger = LoggerFactory.getLogger(AnimalPartTypeController.class);

    private AnimalPartTypeClient animalPartTypeClient;

    public AnimalPartTypeController()
    {
        this.animalPartTypeClient = new AnimalPartTypeClientImpl();
    }

    @GetMapping(value = "/animalparttype/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAnimalPartType(@PathVariable("id") int id)
    {
        try
        {
            AnimalPartType animalPartType = animalPartTypeClient.getAnimalPartType(id);
            if(animalPartType != null)
                return new ResponseEntity<Object>(animalPartType, HttpStatus.OK);
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
