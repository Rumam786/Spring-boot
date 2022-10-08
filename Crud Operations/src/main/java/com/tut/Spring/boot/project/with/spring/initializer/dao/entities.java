package com.tut.Spring.boot.project.with.spring.initializer.dao;

import com.tut.Spring.boot.project.with.spring.initializer.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface entities extends CrudRepository<User , Integer> {
}
