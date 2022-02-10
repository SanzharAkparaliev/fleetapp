package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
