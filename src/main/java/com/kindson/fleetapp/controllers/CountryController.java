package com.kindson.fleetapp.controllers;

import com.kindson.fleetapp.models.Country;
import com.kindson.fleetapp.services.CountryService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/countries/findById")
    @ResponseBody
    public Optional<Country> getCountry(int id){
        return countryService.findById(id);
    }

    @RequestMapping(value = "/countries/update",method = {RequestMethod.PUT ,RequestMethod.GET })
    public String update(Country country){
        countryService.save(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/delete",method = {RequestMethod.DELETE ,RequestMethod.GET })
    public String delete(int id){
        countryService.delete(id);
        return "redirect:/countries";
    }
}
