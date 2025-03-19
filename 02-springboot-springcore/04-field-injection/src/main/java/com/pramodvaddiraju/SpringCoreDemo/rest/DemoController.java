package com.pramodvaddiraju.SpringCoreDemo.rest;

import com.pramodvaddiraju.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define a field injection for dependency injection
    @Autowired
    private Coach myCoach;

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.dailyWorkout();
    }


}
