package com.svg.java.spring.springboot.web.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.svg.java.spring.springboot.web.WebApplication;
import com.svg.java.spring.springboot.web.model.User;

@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = WebApplication.class)
class UserRepositoryJPATest {

	   @Autowired
	   private UserRepository userRepository;
/*
	   @Test
	   public void testFindById() {
	      User user = getUser();	     
	      userRepository.insertUser(user);
	      User result = userRepository.findUserById(user.getId());
	      assertEquals(user.getId(), result.getId());	     
	   }

	   @Test
	   public void testFindAllUsers() {
	      User user = getUser();	     
	      userRepository.insertUser(user);
	      List<User> result = new ArrayList<>();
	      //result.addAll(userRepository.findAllUsers());
	      int a = userRepository.findAllUsers().size();
	      System.out.println("<<<<<<<<<"+a);
	      //userRepository.findAllUsers().forEach(e -> result.add(e));
	      assertTrue(result.size() > 0);	     
	   }	
	   
	   @Test
	   public void testInsert() {
		  User user = getUser();
		  userRepository.insertUser(user);
	      User found = userRepository.findUserById(user.getId());
	      assertEquals(user.getId(), found.getId());	     	 	     
	   }	   

	   @Test
	   public void testDelete() {
		  User user = getUser();
		  userRepository.insertUser(user);
		  userRepository.deleteUser(user);		  
	      User found = userRepository.findUserById(user.getId());
	      assertEquals(found, null);	     	 	     
	   }	   
	   
	   private User getUser() {
		  User user = new User();
		  user.setId("11122233A");
		  user.setName("Mahesh");
		  user.setEmail("mahesh@test.com");
	      return user;	      
	   }	   
*/	   
}
