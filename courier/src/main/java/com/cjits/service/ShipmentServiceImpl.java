
package com.cjits.service;
import com.cjits.entity.Shipment;
import com.cjits.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class ShipmentServiceImpl implements ShipmentService {
        @Autowired
        private ShipmentRepository repo;
        @Override
        public Shipment saveProduct(Shipment shipment) {
            return repo.save(shipment);

        }

        @Override
        public List<Shipment> getAllProducts() {
            return repo.findAll();

        }

        @Override
        public Shipment findProductById(long id) throws RuntimeException {
            Optional<Shipment> prod = repo.findById(id);
            if(prod.isPresent()) {
                return prod.get();
            }else {
                throw new RuntimeException("Entered id:" + id + "Not found in repositories");
            }
        }


        @Override
        public Shipment updateProduct(Shipment p, long id) throws RuntimeException {
            Shipment prod = repo.findById(id).get();
            if(prod.getShipment_id()!=0) {
                prod.setShipment_id(p.getShipment_id());
                prod.setStart_date(p.getStart_date());
                prod.setRecieve_date(p.getRecieve_date());
                prod.setShipment_status(p.getShipment_status());
                prod.setDistance(p.getDistance());
                prod.setShipment_volume(p.getShipment_volume());
                prod.setWeight(p.getWeight());
            }
            else
            {
                throw new RuntimeException("Entered shipment id:"+id+" Not found");
            }
            repo.save(prod);
            return prod;
        }

        @Override
        public void deleteProduct(long id) {
            repo.deleteById(id);

        }
    }

