package com.bizianov.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/afs")
public class AFSController {

    @GetMapping(value = "/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to AFS");
    }
}
