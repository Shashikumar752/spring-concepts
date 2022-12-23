package com.shashi.spring.core.applications;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashi.spring.core.classes.FootballCoach;
import com.shashi.spring.core.interfaces.Coach;
public class FootballCoachApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Coach fCoach = (FootballCoach) context.getBean("fCoach", Coach.class);
        Coach fCoach1 = (FootballCoach) context.getBean("fCoach", Coach.class);
        fCoach.provideGreetings();
        fCoach.startWorkout();
        boolean isEqual = fCoach==fCoach1;
        System.out.println("objects are equal: "+ isEqual  + " "+ fCoach + " "+ fCoach1);
        context.close();

    }
}