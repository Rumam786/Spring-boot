package com.tut.Spring.boot.project.with.spring.initializer.dao;

import com.tut.Spring.boot.project.with.spring.initializer.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface entities extends CrudRepository<User , Integer> {
    public List<User> findById(int id);
    public List<User> findByName(String name);
    public List<User> findByCity(String city);
    public List<User> findByStatus(String status);
    public List<User> findByNameStartingWith(String name);
    public List<User> findByNameEndingWith(String name);
    public List<User> findByNameContaining(String name);
    public List<User> findByNameAndCity(String name, String city);
    public List<User> findByNameOrStatus(String name, String status);
    public List<User> findByNameLike(String likepattern);
}
