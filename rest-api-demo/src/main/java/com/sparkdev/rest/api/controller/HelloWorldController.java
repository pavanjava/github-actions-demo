package com.sparkdev.rest.api.controller;

import com.sparkdev.rest.api.dto.Message;
import com.sparkdev.rest.api.service.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

    private final HelloWorld helloWorld;

    public HelloWorldController(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> fetchMessage(){
        return ResponseEntity.ok(this.helloWorld.getMessage());
    }
}
