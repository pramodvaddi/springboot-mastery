package com.pramodvaddiraju.springcoredemo.commons;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    // Define your init method
    @PostConstruct
    public void doMyStartUp(){
        System.out.println("In doMyStartUp(): " + getClass().getSimpleName());
    }


    // Define your destroy method
    @PreDestroy
    public void doMyCleanUp(){
        System.out.println("In doMyCleanUp(): " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes";
    }
}

