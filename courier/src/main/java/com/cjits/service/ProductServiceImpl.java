package com.cjits.service;
import com.cjits.entity.Product;
import com.cjits.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

    @Service
    public class ProductServiceImpl implements ProductService{
        @Autowired
        private ProductRepository repo;

        @Override
        public Product saveProduct(Product product) {
            return (Product) repo.save(product);
        }

        @Override
        public List<Product> getAllProducts() {
            return repo.findAll();
        }

        @Override
        public Product findProductById(long id) throws RuntimeException {
            Optional<Product> prod = repo.findById(id);
            if(prod.isPresent()) {
                return prod.get();
            }else
            {
                throw new RuntimeException("Entered id:"+id+"Not found in repositories");
            }
        }

        @Override
        public Product updateProduct(Product p, long id) throws RuntimeException {
            Product prod = (Product) repo.findById(id).get();
            if(prod.getProductId()!=0) {
                prod.setProductType(p.getProductType());
                prod.setProductVolume(p.getProductVolume());
                prod.setProductWeight(p.getProductWeight());
            }
            else
            {
                throw new RuntimeException("Entered product id:"+id+" Not found");
            }
            repo.save(prod);
            return prod;
        }

        @Override
        public void deleteProduct(long id) {
            repo.deleteById(id);
        }
    }
