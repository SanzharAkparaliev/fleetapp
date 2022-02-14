package com.kindson.fleetapp.controllers;

import com.kindson.fleetapp.models.Country;
import com.kindson.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(Model model) {
        List<Country> countryList = countryService.getCountries() ;
        model.addAttribute("countries",countryList);
        model.addAttribute("pageTitle","Countries");
        return "country";

    }

    @PostMapping("/countries/addNew")
    public String addNew(@ModelAttribute Country country){
        countryService.save(country);
        return "redirect:/countries";
    }
}
