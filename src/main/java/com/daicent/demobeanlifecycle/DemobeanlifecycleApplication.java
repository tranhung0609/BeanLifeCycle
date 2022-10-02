package com.daicent.demobeanlifecycle;

import com.daicent.demobeanlifecycle.model.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemobeanlifecycleApplication {

	public static void main(String[] args) {
		System.out.println("main start");
		ApplicationContext context = SpringApplication.run(Test.class, args);
		System.out.println("main end");
		Test test = context.getBean(Test.class);
		System.out.println(test);
		System.out.println("main end2");
		((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(test);
		System.out.println("main end3");


	}

}
