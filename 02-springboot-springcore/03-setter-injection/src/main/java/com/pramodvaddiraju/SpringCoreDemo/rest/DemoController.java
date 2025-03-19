package com.pramodvaddiraju.SpringCoreDemo.rest;

import com.pramodvaddiraju.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define private field for the dependency
    private Coach myCoach;

    // Define a setter injection for dependency injection
    @Autowired
    public void setCoach(Coach theCoach){
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.dailyWorkout();
    }


}
