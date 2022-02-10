package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Integer> {
}
