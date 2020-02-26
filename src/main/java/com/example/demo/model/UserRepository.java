package com.example.demo.model;

import com.example.demo.controller.*;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
