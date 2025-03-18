package com.pramod.springboot.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Inject properties for coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // Expose new endpoint for "Team info"
    @GetMapping("/teaminfo")
    public String teamInfo(){
        return "Coach Name: " + coachName + ", Team Info: " + teamName;
    }

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
