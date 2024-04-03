
    package com.cjits.service;

import com.cjits.entity.Bill;

import java.util.List;

    public interface BillService {

        public Bill saveProduct(Bill bill);
        public List<Bill>getAllProducts();
        public Bill findProductById(long id) throws RuntimeException;
        public Bill updateProduct(Bill p,long id) throws RuntimeException;
        public void deleteProduct(long id);

    }

