package com.example.arthobby.repo;

import com.example.arthobby.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}

