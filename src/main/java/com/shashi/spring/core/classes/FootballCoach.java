package com.shashi.spring.core.classes;

import com.shashi.spring.core.interfaces.Coach;
import com.shashi.spring.core.interfaces.GreetingService;

public class FootballCoach implements Coach {

    private String name;
    private GreetingService greetingService;

    public FootballCoach(String name, GreetingService greetingService) {
        this.name = name;
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

    public void initializeMethod(){
        System.out.println("initalizing the football coach object");
    }
    public void cleanUp(){
        System.out.println("cleaning the things before closeup of football coach app");
    }
}
