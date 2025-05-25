package com.sandeep.learn;

import com.sandeep.learn.model.Alien;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class LearnApplication {


	@PostConstruct
	public void init(){
		log.info("Application Started");
	}

	public static void main(String[] args) {
		log.info("Application Executing..");
		ConfigurableApplicationContext ctx = SpringApplication.run(LearnApplication.class, args);
//		Alien a = ctx.getBean(Alien.class);
//		a.show();
//		Alien a1 = ctx.getBean(Alien.class);
//		a1.show();
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
//		return args -> {
//			System.out.println("lets inspect the beans provided by spring boot");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.stream(beanNames).forEach(System.out::println);
//
//		};
//	}

}
