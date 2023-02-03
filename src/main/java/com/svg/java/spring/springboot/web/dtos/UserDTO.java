package com.svg.java.spring.springboot.web.dtos;

import com.svg.java.spring.springboot.web.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	private String id;
	private String name;
	private String email;	
	private int numberOfTask;
	
	public UserDTO(User user) {
		this.setId(user.getId());
		this.setName(user.getName());
		this.setEmail(user.getEmail());
		this.setNumberOfTask(user.getUserTasks().size());
	}
}
