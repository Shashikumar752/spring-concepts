package com.shashi.spring.core.applications;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shashi.spring.core.classes.SwimCoachConfig;
import com.shashi.spring.core.interfaces.Coach;

public class SwimCoachApplication {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SwimCoachConfig.class);
        Coach coach = context.getBean("swimCoach", Coach.class);
        coach.provideGreetings();
        coach.startWorkout();
        context.close();
    }
}
