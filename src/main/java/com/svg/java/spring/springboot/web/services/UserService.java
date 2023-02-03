package com.svg.java.spring.springboot.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.svg.java.spring.springboot.web.model.Task;
import com.svg.java.spring.springboot.web.model.User;
import com.svg.java.spring.springboot.web.repositories.TaskRepository;
import com.svg.java.spring.springboot.web.repositories.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	private TaskRepository taskRepository;
	
	public UserService(UserRepository userRepository, TaskRepository taskRepository) {
		super();
		this.userRepository = userRepository;
		this.taskRepository = taskRepository;
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}

	public Optional<User> findById(String id) {
		return userRepository.findById(id);
	}

	public void delete(User user) {
		userRepository.delete(user);
	}

	public void insert(User user) {
		userRepository.save(user);
	}

	public void update(User user) {
		userRepository.save(user);
	}

	public List<Task> findAllTasksByUser(String id) {
		return taskRepository.findAllTasksByUser(id);
	}

	public Optional<Task> findById(Integer id) {
		return taskRepository.findById(id);
	}

	public void delete(Task task) {
		taskRepository.delete(task);
	}

	public void insert(Task task) {
		taskRepository.save(task);
	}

	public void update(Task task) {
		taskRepository.save(task);
	}

}
