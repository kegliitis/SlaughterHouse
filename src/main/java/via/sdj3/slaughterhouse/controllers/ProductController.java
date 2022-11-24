package via.sdj3.slaughterhouse.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.clients.implementations.ProductClientImpl;
import via.sdj3.slaughterhouse.clients.interfaces.ProductClient;
import via.sdj3.slaughterhouse.model.Product;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController
{
    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    private ProductClient productClient;

    public ProductController()
    {
        this.productClient = new ProductClientImpl();
    }

    @PostMapping("/products")
    public ResponseEntity<String> createProduct(@RequestBody Product product)
    {
        try
        {
         String response = productClient.createProduct(product);
         return new ResponseEntity<String>(response, HttpStatus.OK);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(),e);
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping(value = "/product/{id]", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getProductById(@PathVariable("id") int id)
    {
        try
        {
            Product product = productClient.getProduct(id);
            if(product != null)
                return new ResponseEntity<Object>(product, HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(),e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/products/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Integer>> getProductsIds(@PathVariable("id") int id)
    {
        try
        {
            List<Integer> products = productClient.getProducts(id);
            return new ResponseEntity<List<Integer>>(products, HttpStatus.OK);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(),e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
