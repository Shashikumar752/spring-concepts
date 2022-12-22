package com.shashi.spring.core.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shashi.spring.core.interfaces.Coach;
import com.shashi.spring.core.interfaces.GreetingService;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Scope("singleton")
@NoArgsConstructor
public @Data class HockeyCoach implements Coach {

    private String name;
    @Autowired
    @Qualifier("happinessGreeting")
    private GreetingService greetingService;
    @Override
    public void startWorkout() {
        // TODO Auto-generated method stub
        System.out.println("practice drag flick");
    }
    @Override
    public void provideGreetings() {
        // TODO Auto-generated method stub
        greetingService.provideGreetings();
    }
}
