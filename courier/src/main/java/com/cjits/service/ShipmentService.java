
    package com.cjits.service;

import com.cjits.entity.Shipment;

import java.util.List;


    public interface ShipmentService {
        public Shipment saveProduct(Shipment shipment);
        public List<Shipment> getAllProducts();
        public Shipment findProductById(long id) throws RuntimeException;

        public Shipment updateProduct(Shipment p,long id) throws RuntimeException;
        public void deleteProduct(long id);

    }
