package com.kindson.fleetapp.repositories;

import com.kindson.fleetapp.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleRepository extends JpaRepository<JobTitle,Integer> {
}
