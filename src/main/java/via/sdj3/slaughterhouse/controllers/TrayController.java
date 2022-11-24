package via.sdj3.slaughterhouse.controllers;

import io.grpc.netty.shaded.io.netty.handler.codec.serialization.ObjectEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.clients.implementations.TrayClientImpl;
import via.sdj3.slaughterhouse.clients.interfaces.TrayClient;
import via.sdj3.slaughterhouse.model.Product;
import via.sdj3.slaughterhouse.model.Tray;

@RestController
@RequestMapping("/")
public class TrayController {
    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    private TrayClient trayClient;

    public TrayController() {
        this.trayClient = new TrayClientImpl();
    }

    @PostMapping("/trays")
    public ResponseEntity<String> createTray(@RequestBody Tray tray) {
        try {
            String response = trayClient.createTray(tray);
            return new ResponseEntity<String>(response, HttpStatus.OK);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/trays/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getTrayById(@PathVariable("id") int id) {
        try {
            Tray tray = trayClient.getTray(id);
            if (tray != null)
                return new ResponseEntity<Object>(tray, HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }


}
