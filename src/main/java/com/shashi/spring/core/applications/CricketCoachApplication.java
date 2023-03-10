package com.shashi.spring.core.applications;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashi.spring.core.classes.CricketCoach;
import com.shashi.spring.core.interfaces.Coach;

public class CricketCoachApplication {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Coach coach = (CricketCoach) context.getBean("cricketCoach", Coach.class);
        coach.provideGreetings();
        coach.startWorkout();
        Coach fCoach1 = (CricketCoach) context.getBean("cricketCoach", Coach.class);
        boolean isEqual = coach==fCoach1;
        System.out.println("objects are equal: "+ isEqual  + " "+ coach + " "+ fCoach1);
        context.close();
    }
}
