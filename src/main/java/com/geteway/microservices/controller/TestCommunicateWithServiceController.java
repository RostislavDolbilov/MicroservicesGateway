package com.geteway.microservices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestCommunicateWithServiceController {
    final String URL_TODO = "http://localhost:8090/todos/get_todo?id=";

    @GetMapping("/get_todo")
    public ResponseEntity getTodo(@RequestParam  Long id){
        RestTemplate restTemplate = new RestTemplate();
        try {
            return ResponseEntity.ok(restTemplate.getForObject(URL_TODO + id, String.class));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
