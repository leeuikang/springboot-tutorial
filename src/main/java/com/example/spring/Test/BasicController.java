package com.example.spring.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    private static final String helloWorldTemplate = "Hello World, %s!";

    @GetMapping("/test/dummy-service")
    public String errorService(){
        throw new RuntimeException("Some Exception Occured");
    }
}
