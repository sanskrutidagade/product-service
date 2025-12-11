package com.springboot.productservice.controller;

import com.springboot.productservice.entity.Product;
import com.springboot.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private final ProductService service;

    public ProductController(ProductService service){
        this.service=service;
    }

    @PostMapping
    public Product create(@RequestBody Product p){
        return service.createProduct(p);
    }
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return service.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.deleteProduct(id);
        List<Product> p = service.getAllProducts();
        System.out.println(p);
        return "Product deleted";
    }

}
