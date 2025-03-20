package com.pramodvaddiraju.springcoredemo.config;

import com.pramodvaddiraju.springcoredemo.commons.Coach;
import com.pramodvaddiraju.springcoredemo.commons.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }


}
