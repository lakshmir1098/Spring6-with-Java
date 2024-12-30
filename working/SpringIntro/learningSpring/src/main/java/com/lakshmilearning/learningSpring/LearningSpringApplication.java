package com.lakshmilearning.learningSpring;

import com.lakshmilearning.learningSpring.SpringConfig.HelloWordConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LearningSpringApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HelloWordConfiguration.class);
		System.out.println(context.getBean("name"));
	}

}
