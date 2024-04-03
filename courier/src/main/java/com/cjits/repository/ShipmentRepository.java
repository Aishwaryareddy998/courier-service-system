
package com.cjits.repository;
import com.cjits.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

    public interface ShipmentRepository extends JpaRepository<Shipment,Long> {

    }

