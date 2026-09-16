package com.storewithola.practicalstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticalStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticalStoreApplication.class, args);
    }

    @GetMapping
    public String helloWorld(){
        return "Hello world spring boot";
    }
}
