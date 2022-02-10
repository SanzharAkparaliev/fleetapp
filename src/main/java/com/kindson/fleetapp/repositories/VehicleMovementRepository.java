package com.kindson.fleetapp.repositories;


import com.kindson.fleetapp.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement,Integer> {
}
