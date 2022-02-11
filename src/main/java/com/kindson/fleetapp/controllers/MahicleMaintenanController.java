package com.kindson.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MahicleMaintenanController {

    @GetMapping("/mahiclemaintenans")
    public String getMahicleMaintean(){
        return "MahicleMaintenan";
    }

}
