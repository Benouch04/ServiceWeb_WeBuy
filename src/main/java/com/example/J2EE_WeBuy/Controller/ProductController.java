package com.example.J2EE_WeBuy.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.J2EE_WeBuy.Entity.Product;
import com.example.J2EE_WeBuy.Service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/product_index")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/name/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/product/update")
    public Product updateProduct(Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}