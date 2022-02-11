package com.kindson.fleetapp.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MahicleMakeController {
    @GetMapping("/mahiclemakes")
    public String getMahicleMake(){
        return "MahicleMake";
    }
}
