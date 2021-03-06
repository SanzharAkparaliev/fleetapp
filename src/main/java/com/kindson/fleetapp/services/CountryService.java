package com.kindson.fleetapp.services;


import com.kindson.fleetapp.models.Country;
import com.kindson.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    public void save(Country country){
        countryRepository.save(country);
    }

    public Optional<Country> findById(int id) {
      return    countryRepository.findById(id);
    }

    public void delete(Integer id) {
        countryRepository.deleteAllById(Collections.singleton(id));
    }
}
