package com.example.arthobby.controller;

import com.example.arthobby.model.Product;
import com.example.arthobby.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
//@Transactional
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/getAllProducts")

    public List<Product> getAllProducts(Model model) {
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return productService.getAllProduct();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProductById(@PathVariable Long id, Model model) {
        model.addAttribute("cakes", productService.getProductById(id));
        return productService.getProductById(id);
    }
    @PostMapping("/saveProduct")
    public void saveProduct(@RequestBody Product product) throws IOException {
        productService.saveProduct(product);
    }

    @GetMapping("/filterByDate")
    public List<Product> filterByDate(){
        return productService.filterByDateDESC();
    }

    @GetMapping("/getAllUniqueProductTypes")
    public List<String> getAllUniqueProductTypes(){
        return productService.findOnlyProductTypes();
    }
}
