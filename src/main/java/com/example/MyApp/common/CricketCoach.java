package com.example.MyApp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// Only one class can be primary
@Primary 
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes. :-)";
    }
    
}
