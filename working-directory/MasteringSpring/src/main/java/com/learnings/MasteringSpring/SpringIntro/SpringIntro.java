package com.learnings.MasteringSpring.SpringIntro;

import com.learnings.MasteringSpring.SpringIntro.Configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIntro {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("author"));
    }

}
