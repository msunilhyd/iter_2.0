package com.dailycodebuffer.crudWithHashMap.controller;

import com.dailycodebuffer.crudWithHashMap.model.Product;
import com.dailycodebuffer.crudWithHashMap.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductServiceController {

    @Autowired
    ProductService productService;

    private static Map<String, Product> productRepo = new HashMap<>();

    @RequestMapping(value="/products/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product is Deleted successfully", HttpStatus.OK);
    }

    @RequestMapping(value="/products/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {

        productService.updateProduct(id, product);
        return new ResponseEntity<>("Product Updated Successfully", HttpStatus.OK);
    }

    @RequestMapping(value="/products", method=RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {

        productService.createProduct(product);
        return new ResponseEntity<>("Product Created Successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value="/products")
    public ResponseEntity<Object> getProducts() {

        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }
}
