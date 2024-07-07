package com.teamhyeok.legacysupermarket.status.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/status")
@RestController
public class StatusController {

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm alive!";
    }

}
