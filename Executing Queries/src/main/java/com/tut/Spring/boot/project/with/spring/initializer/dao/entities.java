package com.tut.Spring.boot.project.with.spring.initializer.dao;

import com.tut.Spring.boot.project.with.spring.initializer.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface entities extends CrudRepository<User , Integer> {
        @Query("Select u from User u")
        public List<User> getAll();
        @Query("Select u from User u WHERE u.name=:n")
    public List<User> getUserByName(@Param("n") String name);

        @Query("Select u from User u WHERE u.name=:n and u.city=:c")
    public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);

        @Query(value = "Select * from user",nativeQuery=true)
        public List<User> getUsers();
}
