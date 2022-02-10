package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
