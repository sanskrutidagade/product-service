package com.springboot.productservice.serviceimpl;

import com.springboot.productservice.entity.Product;
import com.springboot.productservice.repository.ProductRepository;
import com.springboot.productservice.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductsServiceImpl implements ProductService {

    private final ProductRepository repo;

    //constructor injection
    public ProductsServiceImpl(ProductRepository repo){
        this.repo=repo;
    }

    @Override
    public Product createProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}
