
    package com.cjits.service;
import java.util.List;
import com.cjits.entity.Product;

    public interface ProductService {
        public Product saveProduct(Product product);
        public List<Product> getAllProducts();
        public Product findProductById(long id) throws RuntimeException;
        public Product updateProduct(Product p, long id) throws RuntimeException;
        public void deleteProduct(long id);
    }
