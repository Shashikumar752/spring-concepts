package com.shashi.spring.core.classes;

import com.shashi.spring.core.interfaces.GreetingService;

public class FortuneGreeting implements GreetingService {

    @Override
    public void provideGreetings() {
        System.out.println("you have a lucky day");
        
    }
    
}
