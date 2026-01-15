package com.sofiane.demo; // Correspond exactement à tes dossiers 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Ajouté pour créer l'API Web 
public class DemoGithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGithubApplication.class, args);
    }

    @GetMapping("/") // Route par défaut 
    public String sayHello() {
        return "Hello, World! TP Docker SpringBoot de Sofiane réussi."; [cite: 301]
    }
}
