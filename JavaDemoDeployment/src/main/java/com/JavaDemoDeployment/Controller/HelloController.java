package com.JavaDemoDeployment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "✅ Spring Boot Demo App Deployed Successfully via Jenkins CI/CD!";
    }

    @GetMapping("/hello/check")
    public String hello() {
        return "Hello, Jenkins CI/CD Pipeline is Working!";
    }
}
