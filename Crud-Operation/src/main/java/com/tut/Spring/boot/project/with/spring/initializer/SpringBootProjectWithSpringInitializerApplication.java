package com.tut.Spring.boot.project.with.spring.initializer;

import com.tut.Spring.boot.project.with.spring.initializer.dao.entities;
import com.tut.Spring.boot.project.with.spring.initializer.entities.User;

import antlr.collections.List;

import java.util.ArrayList;
import java.util.Optional;

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
      Optional<User> opt = entities.findById(4);
      User user = opt.get();
      user.setName("Arslan");
      User result = entities.save(user);
      System.out.println(result);
  }
}
