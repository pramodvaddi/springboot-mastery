package com.pramodvaddiraju.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Baseball practise";
    }
}
