package com.shashi.spring.core.classes;

import com.shashi.spring.core.interfaces.GreetingService;

public class RestGreeting implements GreetingService {

    @Override
    public void provideGreetings() {
        // TODO Auto-generated method stub
        System.out.println("rest in water");
    }
    
}
