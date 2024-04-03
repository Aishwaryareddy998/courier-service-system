
    package com.cjits.controller;
import com.cjits.entity.Bill;
import com.cjits.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

    @RestController
    @RequestMapping("/restapi/bill")
    public class BillController {
        Logger logger = Logger.getLogger(this.getClass().getName());
        @Autowired
        private BillService service;

        //1. Create REST API
        @PostMapping
        public ResponseEntity<Bill> saveProduct(@RequestBody Bill s) {
            logger.warning("printing : " + s);
            return new ResponseEntity<Bill>(service.saveProduct(s), HttpStatus.CREATED);
        }

        //2. Get REST API
        @GetMapping
        public List<Bill> getAllProducts() {
            return service.getAllProducts();
        }

        //3. Get REST API by Id
        @GetMapping("{id}")
        public ResponseEntity<Bill> getProductById(@PathVariable("id") long shipment_id) throws RuntimeException {
            return new ResponseEntity<Bill>(service.findProductById(shipment_id), HttpStatus.OK);
        }


        //4. Update REST API
        @PutMapping("{id}")
        public ResponseEntity<Bill> updateProduct(@RequestBody Bill bill, @PathVariable("id") long bill_id) throws RuntimeException {
            return new ResponseEntity<Bill>(service.updateProduct(bill, bill_id), HttpStatus.OK);
        }

        //5. Delete REST API
        @DeleteMapping("{id}")
        public ResponseEntity<String> deleteProduct(@PathVariable("id") long productId) {
            service.deleteProduct(productId);
            return new ResponseEntity<String>("Deleted", HttpStatus.OK);
        }
    }
