package com.inventory.system;


import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRespository;

    public ProductService(ProductRepository productRespository) {
        this.productRespository = productRespository;
    }


    public Product addInventory(Product product) {
       return productRespository.save(product);
    }

    public void deleteInventory(Long id) {
        productRespository.deleteById(id);
    }

}


