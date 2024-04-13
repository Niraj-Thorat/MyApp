package com.example.MyApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyApp.common.Coach;

@RestController
public class DemoController {
    // Define private field for dependecncy
    // @Autowired
    private Coach myCoach;
    private Coach anotherCoach;
    // Define constructor for dependency injection
    // @Autowired
    // public DemoController(@Qualifier("trackCoach") Coach theCoach, 
    // @Qualifier("trackCoach") Coach theAnotherCoach) {
    //     myCoach = theCoach;
    //     anotherCoach = theAnotherCoach;
    // }

    // Setter Injection
    // @Autowired
    // public void setCoach(@Qualifier("baseballCoach") Coach theCoach){
    // myCoach = theCoach;
    // }

    // @Autowired
    // public DemoController(Coach theCoach) {
    //     System.out.println("In Constructor: "+getClass().getSimpleName());
    //     myCoach = theCoach;
    // }

    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach){
        System.out.println("In Constructor: "+getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
