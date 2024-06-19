package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myLons")
    public String getLoansDetail() {
        return "Here are the card details from the DB";
    }
}
