package com.Product.Rest_API.Services;

import com.Product.Rest_API.Model.Product;
import com.Product.Rest_API.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;

    public List<Product> getProduct() {
        return repository.findAll();
    }
    public Product getSingleProduct(int productId) {
        return repository.findById(productId).orElse(new Product());
    }

    public String addProduct(Product product) {
        repository.save(product);
        return "New Product is added";
    }

    public String updateProduct(Product product) {
        repository.save(product);
        return"Product Details Updated ";
    }

    public String deletProduct(int productId) {
        repository.deleteById(productId);
        return "The Product is Deleted";
    }
}
