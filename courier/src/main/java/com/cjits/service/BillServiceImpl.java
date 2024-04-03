
    package com.cjits.service;

import com.cjits.entity.Bill;
import com.cjits.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class BillServiceImpl implements BillService{

        @Autowired
        private BillRepository repo;

        @Override
        public Bill saveProduct(Bill bill) {
            return repo.save(bill);
        }

        @Override
        public List<Bill> getAllProducts() {
            return repo.findAll();
        }

        @Override
        public Bill findProductById(long id) throws RuntimeException {
            Optional<Bill> prod=repo.findById(id);
            if (prod.isPresent()){
                return prod.get();
            }else {
                throw new RuntimeException("Entered id:" +id+"Not found in repositories");
            }

        }

        @Override
        public Bill updateProduct(Bill p, long id) throws RuntimeException {
            Bill prod=repo.findById(id).get();
            if (prod.getBillId()!=0){
                prod.setBillId(p.getBillId());
                prod.setBillStatus(p.getBillStatus());
                prod.setPaymentStatus(p.getPaymentStatus());
                prod.setPaymentType(p.getPaymentType());
            }else {
                throw new RuntimeException("Entered bill id:" +id+"Not found");
            }
            repo.save(prod);
            return prod;
        }

        @Override
        public void deleteProduct(long id) {
            repo.deleteById(id);
        }
    }
