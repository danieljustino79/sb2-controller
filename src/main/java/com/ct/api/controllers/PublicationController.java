package com.ct.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/publication")
public class PublicationController {

    @GetMapping()
    public String publications(){
        return "users";
    }
}
