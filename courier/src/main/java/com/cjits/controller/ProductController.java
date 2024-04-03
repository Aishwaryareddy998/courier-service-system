package com.cjits.controller;
import com.cjits.entity.Product;
import com.cjits.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.logging.Logger;
    @RestController
    @RequestMapping("/restapi/products")
    public class ProductController {
        Logger logger = Logger.getLogger(this.getClass().getName());
        @Autowired
        private ProductService service;

        //1. Create REST API
        @PostMapping
        public ResponseEntity<Product> saveProduct(@RequestBody Product p) {
            logger.warning("printing : " + p);
            return new ResponseEntity<Product>(service.saveProduct(p), HttpStatus.CREATED);
        }
        //2. Get REST API
        @GetMapping
        public List<Product> getAllProducts(){
            return service.getAllProducts();
        }
        //3. Get REST API by Id
        @GetMapping("/{id}")
        public ResponseEntity<Product> getProductById(@PathVariable("id") long productId) throws RuntimeException{
            return new ResponseEntity<Product>(service.findProductById(productId),HttpStatus.OK);
        }
        //4. Update REST API
        @PutMapping("/{id}")
        public ResponseEntity<Product> updateProduct(@RequestBody Product p,@PathVariable("id") long productId) throws RuntimeException{
            return new ResponseEntity<Product>(service.updateProduct(p, productId), HttpStatus.OK);
        }
        //5. Delete REST API
        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteProduct(@PathVariable("id") long productId){
            service.deleteProduct(productId);
            return new ResponseEntity<String>("Deleted",HttpStatus.OK);
        }


    }
