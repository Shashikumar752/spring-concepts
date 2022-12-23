package com.shashi.spring.core.classes;

import org.springframework.stereotype.Component;

import com.shashi.spring.core.interfaces.GreetingService;

@Component
public class FortuneGreeting implements GreetingService {

    @Override
    public void provideGreetings() {
        System.out.println("you have a lucky day");
        
    }
    
}
