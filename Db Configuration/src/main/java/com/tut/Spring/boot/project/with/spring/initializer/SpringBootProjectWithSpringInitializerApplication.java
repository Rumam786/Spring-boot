package com.tut.Spring.boot.project.with.spring.initializer;

import com.tut.Spring.boot.project.with.spring.initializer.dao.entities;
import com.tut.Spring.boot.project.with.spring.initializer.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjectWithSpringInitializerApplication {

	public static void main(String[] args) {
	ApplicationContext context =SpringApplication.run(SpringBootProjectWithSpringInitializerApplication.class, args);
	entities entities = context.getBean(entities.class);
	User user = new User();
	user.setName("Ruman Ali");
	user.setCity("Islamabad");
	user.setStatus("I am a Developer");
	User user2 = entities.save(user);
		System.out.println(user2);
	}

}
