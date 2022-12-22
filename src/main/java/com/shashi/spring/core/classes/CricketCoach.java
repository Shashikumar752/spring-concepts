package com.shashi.spring.core.classes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shashi.spring.core.interfaces.Coach;
import com.shashi.spring.core.interfaces.GreetingService;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

    private String name;
    private GreetingService greetingService;

    public CricketCoach() {}
    
    public CricketCoach(String name,  GreetingService greetingService) {
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

    @Autowired
    @Qualifier("fortuneGreeting")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void startWorkout() {
        // TODO Auto-generated method stub
        System.out.println("Coach: " +name + " Start practicing cacthes");
    }

    @Override
    public void provideGreetings() {
        // TODO Auto-generated method stub
        greetingService.provideGreetings();
    }
    @PostConstruct
    public void initMethod(){
        System.out.println("initalizing the cricket coach object");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("cleaning the things before closeup of cricket coach application");
    }
}
