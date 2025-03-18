package com.pramodvaddiraju.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
// Component annotation marks the class as spring bean. Available for dependency injection.

public class CricketCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Practice daily for 2 hours";
    }
}
