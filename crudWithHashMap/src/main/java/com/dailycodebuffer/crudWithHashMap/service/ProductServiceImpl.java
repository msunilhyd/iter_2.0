package com.dailycodebuffer.crudWithHashMap.service;

import com.dailycodebuffer.crudWithHashMap.exception.ProductNotFoundException;
import com.dailycodebuffer.crudWithHashMap.model.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static Map<String, Product> productRepo = new HashMap<>();

    static {
        Product honey = new Product("1", "Honey");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product("2", "almond");
        productRepo.put(almond.getId(), almond);
    }

    @Override
    public void createProduct(Product product){
        productRepo.put(product.getId(), product);
    }

    @Override
    public void updateProduct(String id, Product product) {

        if (!productRepo.containsKey(id)) {
            throw new ProductNotFoundException();
        }

        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepo.remove(id);
    }

    @Override
    public Collection<Product> getProducts() {
        return productRepo.values();
    }


}
