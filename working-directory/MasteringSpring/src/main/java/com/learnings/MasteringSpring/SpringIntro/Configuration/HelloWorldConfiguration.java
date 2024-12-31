package com.learnings.MasteringSpring.SpringIntro.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String author() {
        return "Lakshmi";
    }
}
