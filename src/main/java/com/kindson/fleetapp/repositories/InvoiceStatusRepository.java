package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus,Integer> {
}
