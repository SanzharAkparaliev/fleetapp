package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType,Integer> {
}
