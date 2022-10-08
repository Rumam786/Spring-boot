package com.tut.Spring.boot.project.with.spring.initializer;

import com.tut.Spring.boot.project.with.spring.initializer.dao.entities;
import com.tut.Spring.boot.project.with.spring.initializer.entities.User;

import antlr.collections.List;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjectWithSpringInitializerApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(
      SpringBootProjectWithSpringInitializerApplication.class,
      args
    );
    entities entities = context.getBean(entities.class);
     User user = new User();
     user.setName("Ruman ALi");
     user.setCity("Islamabad");
     user.setStatus("I am a Developer");
     User myuser = entities.save(user);
     	System.out.println(myuser);

    User user5 = new User();
    user5.setName("Abdullah");
    user5.setCity("Lahore");
    user5.setStatus("I am a College Student");
    User myuser5 = entities.save(user5);
    System.out.println(myuser5);

    User user6 = new User();
    user6.setName("Aroob");
    user6.setCity("Karachi");
    user6.setStatus("I am a also a Student");
    User myuser6 = entities.save(user6);
    System.out.println(myuser6);

  }
}
