
    package com.cjits.controller;
import com.cjits.entity.Shipment;
import com.cjits.service.ProductService;
import com.cjits.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

    @RestController
    @RequestMapping("/restapi/shipments")
    public class ShipmentController {
        Logger logger = Logger.getLogger(this.getClass().getName());
        @Autowired
        private ShipmentService service;

        //1. Create REST API
        @PostMapping
        public ResponseEntity<Shipment> saveProduct(@RequestBody  Shipment s) {
            logger.warning("printing : " + s);
            return new ResponseEntity<Shipment>(service.saveProduct(s), HttpStatus.CREATED);
        }
        //2. Get REST API
        @GetMapping
        public List<Shipment> getAllProducts(){
            return service.getAllProducts();
        }

        //3. Get REST API by Id
        @GetMapping("{id}")
        public ResponseEntity<Shipment> getProductById(@PathVariable("id") long shipment_id) throws RuntimeException{
            return new ResponseEntity<Shipment>(service.findProductById(shipment_id),HttpStatus.OK);
        }


        //4. Update REST API
        @PutMapping("{id}")
        public ResponseEntity<Shipment> updateProduct(@RequestBody Shipment shipment,@PathVariable("id") long shipment_id) throws RuntimeException{
            return new ResponseEntity<Shipment>(service.updateProduct(shipment, shipment_id), HttpStatus.OK);
        }
        //5. Delete REST API
        @DeleteMapping("{id}")
        public ResponseEntity<String> deleteProduct(@PathVariable("id") long productId){
            service.deleteProduct(productId);
            return new ResponseEntity<String>("Deleted",HttpStatus.OK);
        }
    }

