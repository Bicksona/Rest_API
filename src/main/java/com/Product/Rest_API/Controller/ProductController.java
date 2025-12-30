package com.Product.Rest_API.Controller;

import com.Product.Rest_API.Model.Product;
import com.Product.Rest_API.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServices productServices;

    //For getting All Product
    @GetMapping("/product")
    public List<Product> getProduct(){
        return productServices.getProduct();
    }

    //For getting Product by ID
    @GetMapping("/product/{productId}")
    public Product getSingleProduct(@PathVariable int productId){
        return productServices.getSingleProduct(productId);
    }

    //For Add data to it
    @PostMapping("/product")
    public String addProduct(@RequestBody Product product){
        return productServices.addProduct(product);
    }

    //For Update Product
    @PutMapping("/product")
    public String updateProduct(@RequestBody Product product){
        return productServices.updateProduct(product);
    }

    //For Deleting a Product
    @DeleteMapping("/product/{productId}")
    public String deletProduct(@PathVariable int productId){
        return productServices.deletProduct( productId);
    }
}
