package com.kindson.fleetapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/clients")
    public String getClients(){
        return "Client";
    }
}
