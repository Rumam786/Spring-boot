package com.tut.Spring.boot.project.with.spring.initializer;

import com.tut.Spring.boot.project.with.spring.initializer.dao.entities;
import com.tut.Spring.boot.project.with.spring.initializer.entities.User;

import java.util.List;

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

    List<User> users = entities.findById(1);
    System.out.println(users);
    List<User> users1 = entities.findByName("Usman Ali");
    System.out.println(users1);
    List<User> users2 = entities.findByCity("Vehari");
    System.out.println(users2);
    List<User> users3 = entities.findByStatus("I am a Enginner");
    System.out.println(users3);
    List<User> users4 = entities.findByNameStartingWith("F");
    System.out.println(users4);
    List<User> users5 = entities.findByNameEndingWith("h");
    System.out.println(users5);
    List<User> users6 = entities.findByNameContaining("e");
    System.out.println(users6);
    List<User> users7 = entities.findByNameAndCity("Ruman ALi", "Islamabad");
    System.out.println(users7);
    List<User> users8 = entities.findByNameOrStatus("Naeem Ali", "I am a Enginner");
    System.out.println(users8);
    List<User> users9 = entities.findByNameLike("R%m%i");
    System.out.println(users9);
  }
}
