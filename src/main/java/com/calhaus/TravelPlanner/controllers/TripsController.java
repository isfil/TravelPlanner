package com.calhaus.TravelPlanner.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripsController {

     @GetMapping(value = "/health")
    public ResponseEntity<String> healthCheck(){
         return ResponseEntity.status(HttpStatus.OK).body("Hello World");
     }
}
