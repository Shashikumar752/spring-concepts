package com.shashi.spring.core.applications;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashi.spring.core.interfaces.Coach;

public class HockeyCoachApplication {
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Coach coach = context.getBean("hockeyCoach", Coach.class);
        coach.provideGreetings();
        coach.startWorkout();
        context.close();
    }
}
