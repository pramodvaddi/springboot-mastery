package com.pramodvaddiraju.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Run a hard 5K";
    }
}
