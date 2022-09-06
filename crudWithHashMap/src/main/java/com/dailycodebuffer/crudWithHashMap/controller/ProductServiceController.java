package com.dailycodebuffer.crudWithHashMap.controller;

import com.dailycodebuffer.crudWithHashMap.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductServiceController {

    private static Map<String, Product> productRepo = new HashMap<>();

    static {
        Product honey = new Product("1", "Honey");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product("2", "Almond");
        productRepo.put(almond.getId(), almond);
    }

    @RequestMapping(value="/products/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        productRepo.remove(id);
        return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
    }

    @RequestMapping(value="/products/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
        return new ResponseEntity<>("Product Updated Successfully", HttpStatus.OK);
    }

    @RequestMapping(value="/products", method=RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product Created Successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value="/products")
    public ResponseEntity<Object> getProducts() {
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }
}
