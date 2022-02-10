package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
