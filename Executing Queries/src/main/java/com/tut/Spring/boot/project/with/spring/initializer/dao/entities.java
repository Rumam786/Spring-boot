package com.tut.Spring.boot.project.with.spring.initializer.dao;

import com.tut.Spring.boot.project.with.spring.initializer.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface entities extends CrudRepository<User , Integer> {
    @Query("Select u from User u")
    public List<User> getAll();
}
