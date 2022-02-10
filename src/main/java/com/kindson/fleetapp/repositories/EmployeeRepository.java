package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
