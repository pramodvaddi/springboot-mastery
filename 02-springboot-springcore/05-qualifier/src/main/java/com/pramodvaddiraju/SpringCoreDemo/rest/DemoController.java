package com.pramodvaddiraju.SpringCoreDemo.rest;

import com.pramodvaddiraju.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach){
        this.myCoach = theCoach;

    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.dailyWorkout();
    }


}
