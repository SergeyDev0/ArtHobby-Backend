package com.example.arthobby.service;

import com.example.arthobby.model.Product;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    public List<Product> getAllProduct();

    public Product getProductById(Long id);

    void saveProduct(Product product) throws IOException;

    public void deleteProduct(Long id);

    //    public List<Product> filterByNameASC();
//
//    public List<Product> filterByNameDESC();
//
//    public List<Product> filterByPriceASC();
//
//    public List<Product> filterByPriceDESC();
//
//    public List<Product> filterByType();
//
    public List<Product> filterByDateDESC();

    public List<String> findOnlyProductTypes();


}
