package com.pramod.springboot.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" that returns "Hello World"
    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }

    // Expose a new endpoint for "workout".
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5kms";
    }

    // Expose a new endpoint for "fortune".
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }
}
