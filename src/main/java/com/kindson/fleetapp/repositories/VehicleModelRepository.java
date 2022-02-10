package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer> {
}
