package com.lakshmilearning.learningSpring.SpringConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWordConfiguration {

    @Bean
    public String name() {
        return "Lakshmi";
    }

}
