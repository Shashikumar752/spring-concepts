package com.shashi.spring.core.classes;

import org.springframework.stereotype.Component;

import com.shashi.spring.core.interfaces.GreetingService;

@Component
public class HappinessGreeting implements GreetingService {

    @Override
    public void provideGreetings() {
        // TODO Auto-generated method stub
        System.out.println("May god bless you with a lot of hapiness");
    }
    
}
