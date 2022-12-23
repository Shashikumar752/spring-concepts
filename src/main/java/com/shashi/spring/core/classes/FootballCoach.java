package com.shashi.spring.core.classes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shashi.spring.core.interfaces.Coach;
import com.shashi.spring.core.interfaces.GreetingService;

@Component("fCoach")
public class FootballCoach implements Coach {

    private String name;
    private GreetingService greetingService;

    @Autowired
    public FootballCoach(@Qualifier("happinessGreeting") GreetingService greetingService) {
        this.name = "shashi";
        this.greetingService = greetingService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void startWorkout() {
        // TODO Auto-generated method stub
        System.out.println("Coach: " +name + " says, start practicing penalties");
    }

    @Override
    public void provideGreetings() {
        // TODO Auto-generated method stub
        greetingService.provideGreetings();
    }

    @PostConstruct
    public void initializeMethod(){
        System.out.println("initalizing the football coach object");
    }
    @PreDestroy
    public void cleanUp(){
        System.out.println("cleaning the things before closeup of football coach app");
    }
}
