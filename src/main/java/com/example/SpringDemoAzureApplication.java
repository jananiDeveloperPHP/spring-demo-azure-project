package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoAzureApplication {

    @GetMapping("/message")
    public String message(){
        return  "Congrats! youR app deployed successfully in Azure ";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoAzureApplication.class, args);
    }

}
