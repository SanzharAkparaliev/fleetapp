package com.kindson.fleetapp.services;


import com.kindson.fleetapp.models.Country;
import com.kindson.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }
}
