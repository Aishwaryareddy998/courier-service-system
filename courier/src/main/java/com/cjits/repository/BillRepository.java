
    package com.cjits.repository;

import com.cjits.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface BillRepository extends JpaRepository<Bill,Long> {

    }
