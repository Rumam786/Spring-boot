package com.tut.Spring.boot.project.with.spring.initializer;

import com.tut.Spring.boot.project.with.spring.initializer.dao.entities;
import com.tut.Spring.boot.project.with.spring.initializer.entities.User;

import antlr.collections.List;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

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

    Iterable<User> itr = entities.findAll();
    itr.forEach(new Consumer<User>() {
      @Override
      public void accept(User tr) {
        System.out.println(tr);
      }
    });
  }
}
