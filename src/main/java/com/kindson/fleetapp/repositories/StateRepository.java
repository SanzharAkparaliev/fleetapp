package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Integer> {
}
