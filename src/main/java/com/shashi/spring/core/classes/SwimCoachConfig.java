package com.shashi.spring.core.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.shashi.spring.core.interfaces.Coach;
import com.shashi.spring.core.interfaces.GreetingService;

@Configuration
//@ComponentScan("com.shashi.spring.core")
@PropertySource("classpath:coach.properties")
public class SwimCoachConfig {
    
    @Bean
    public GreetingService restGreeting(){
        return new RestGreeting();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(restGreeting());
    }

}
