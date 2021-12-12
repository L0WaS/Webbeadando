package com.example.webbeadando.product.service;

import com.example.webbeadando.product.exception.ProductNotFoundException;
import com.example.webbeadando.product.persistence.entity.Product;
import com.example.webbeadando.product.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    public Product findProductById(Long id){
        return productRepository.findProductById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product by id " + id + " was not found."));
    }

    public void deleteProduct(Long id){
        productRepository.deleteProductById(id);
    }
}
