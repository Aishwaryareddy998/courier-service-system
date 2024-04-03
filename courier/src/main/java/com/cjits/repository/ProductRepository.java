
package com.cjits.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cjits.entity.Product;

    public interface ProductRepository  extends JpaRepository<Product,Long> {

    }
