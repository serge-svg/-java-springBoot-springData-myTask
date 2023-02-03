package com.svg.java.spring.springboot.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.svg.java.spring.springboot.web.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
