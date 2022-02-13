package com.kindson.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {
    @GetMapping("/invoice")
    public String getinvoice(){
        return "Invoice";
    }
}
