package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus,Integer> {
}
