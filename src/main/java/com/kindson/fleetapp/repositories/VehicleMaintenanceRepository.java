package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance,Integer> {
}
