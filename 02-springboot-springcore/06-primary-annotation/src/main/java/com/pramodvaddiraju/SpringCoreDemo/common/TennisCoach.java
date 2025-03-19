package com.pramodvaddiraju.SpringCoreDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {

    @Override
    public String dailyWorkout() {
        return "Tennis is good";
    }
}
