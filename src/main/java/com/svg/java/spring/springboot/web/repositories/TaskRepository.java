package com.svg.java.spring.springboot.web.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.svg.java.spring.springboot.web.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
	
	@Query("SELECT t FROM Task t WHERE t.user.id=:id")
	public List<Task> findAllTasksByUser(String id);
}
