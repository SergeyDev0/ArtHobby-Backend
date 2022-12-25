package com.example.arthobby.service;

import com.example.arthobby.model.Product;
import com.example.arthobby.repo.ProductRepo;
import com.example.arthobby.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id).orElseThrow();
    }


    @Override
    public void saveProduct(Product product) throws IOException {


        LocalDateTime datetime = LocalDateTime.now();

        product.setDateOfCreate(datetime);

        productRepo.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> filterByDateDESC() {
        return productRepo.findAll(Sort.by(Sort.Direction.DESC, "dateOfCreate"));
    }

    @Override
    public List<String> findOnlyProductTypes() {
        return getAllProduct().stream().map(product -> product.getType()).distinct().collect(Collectors.toList());
    }
}



