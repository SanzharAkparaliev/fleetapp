package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Integer> {
}
