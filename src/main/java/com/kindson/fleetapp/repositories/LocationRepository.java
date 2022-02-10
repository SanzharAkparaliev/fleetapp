package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
