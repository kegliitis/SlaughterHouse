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
import via.sdj3.slaughterhouse.clients.implementations.AnimalTypeClientImpl;
import via.sdj3.slaughterhouse.clients.interfaces.AnimalTypeClient;
import via.sdj3.slaughterhouse.model.AnimalType;

@RestController
@RequestMapping
public class AnimalTypeController
{
    private Logger logger = LoggerFactory.getLogger(AnimalTypeController.class);

    private AnimalTypeClient animalTypeClient;

    public AnimalTypeController()
    {
        animalTypeClient = new AnimalTypeClientImpl();
    }

    @GetMapping(value = "/animaltype/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAnimalType(@PathVariable("id") int id)
    {
        try
        {
            AnimalType animalType = animalTypeClient.getAnimalType(id);
            if(animalType != null)
                return new ResponseEntity<Object>(animalType, HttpStatus.OK);
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
