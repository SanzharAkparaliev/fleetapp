package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
