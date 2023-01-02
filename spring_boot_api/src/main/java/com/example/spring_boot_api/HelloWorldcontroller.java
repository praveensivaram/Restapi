package com.example.spring_boot_api;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldcontroller
{
    @GetMapping("/hello-world")
    String return1() 
    {
        return "Hello World";
    }
}
