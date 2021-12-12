package com.example.webbeadando.configuration;

import com.example.webbeadando.product.persistence.entity.Product;
import com.example.webbeadando.product.persistence.repository.ProductRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class InMemoryDatabaseInitializer {

    private final ProductRepository productRepository;

    public InMemoryDatabaseInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void init(){
        Product bike = new Product("Merida Dual Thurst", "bike", 30, 67.2, "");
        Product car = new Product("Mercedes Benz", "car", 130, 11.32,  "");
        Product truck = new Product("dzsondir", "truck", 250, 47.312, "");
        productRepository.saveAll(List.of(bike,car,truck));
    }
}
