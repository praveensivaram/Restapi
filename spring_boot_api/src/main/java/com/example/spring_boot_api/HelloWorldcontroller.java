package com.example.spring_boot_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldcontroller
{
    @GetMapping("/hello-world")
     public String return1() 
    {
        return "Hello World";
    }
    
    @GetMapping("/welcome")
    public String welcomeTo()
    {
    	return "welcome to CI";
    }
  }
