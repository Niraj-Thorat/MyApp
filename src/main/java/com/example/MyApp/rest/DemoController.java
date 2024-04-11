package com.example.MyApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyApp.common.Coach;

@RestController
public class DemoController {
    //Define private field for dependecncy
    //@Autowired
    private Coach myCoach;

    //Define constructor for dependency injection
    // @Autowired
    // public DemoController(Coach theCoach){
    //     myCoach = theCoach;
    // }

    //Setter Injection
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
