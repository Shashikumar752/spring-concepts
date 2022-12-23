package com.shashi.spring.core.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import com.shashi.spring.core.interfaces.Coach;
import com.shashi.spring.core.interfaces.GreetingService;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class SwimCoach implements Coach {

    @Value("${coach.name}")
    private String name;

    private GreetingService greetingService;

    public SwimCoach(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    
    @Override
    public void startWorkout() {
        // TODO Auto-generated method stub
        System.out.println("Coach : " + name + " say start with 1000m warm up");
    }

    @Override
    public void provideGreetings() {
        // TODO Auto-generated method stub
        greetingService.provideGreetings();
    }


}
