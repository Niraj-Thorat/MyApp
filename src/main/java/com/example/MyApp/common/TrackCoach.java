package com.example.MyApp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    // define init method 
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff() : "+ getClass().getSimpleName());
    }

    // define destroy method - destroy method wont be called for prototype scoped beans
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff() : "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

}
