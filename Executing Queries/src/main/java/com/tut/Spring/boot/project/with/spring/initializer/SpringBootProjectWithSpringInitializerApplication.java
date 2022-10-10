package com.tut.Spring.boot.project.with.spring.initializer;

import com.tut.Spring.boot.project.with.spring.initializer.dao.entities;
import com.tut.Spring.boot.project.with.spring.initializer.entities.User;

import java.util.List;
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

    List<User> users = entities.getAll();
    System.out.println(users);

    List<User> users1 = entities.getUserByName("Ruman ALi");
    System.out.println(users1);

    List<User> users2 = entities.getUserByNameAndCity("Arslan", "Burewala");
    users2.forEach(new Consumer<User>() {
      @Override
      public void accept(User user) {
        System.out.println(user);
      }
    });
    List<User> users3 = entities.getUsers();
    System.out.println(users3);
  }
}
