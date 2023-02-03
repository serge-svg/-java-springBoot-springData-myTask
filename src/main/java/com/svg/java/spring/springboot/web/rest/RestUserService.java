package com.svg.java.spring.springboot.web.rest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svg.java.spring.springboot.web.dtos.UserDTO;
import com.svg.java.spring.springboot.web.model.User;
import com.svg.java.spring.springboot.web.services.UserService;

@RestController
@RequestMapping("/webapi/myTask")
public class RestUserService {

	private UserService userService;

	public RestUserService(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping
	public List<UserDTO> findAll() {
		return userService.findAll().stream()
				.map(UserDTO::new)
				.collect(Collectors.toList());				
	}
	
	@GetMapping("{id}")
	public UserDTO findById(@PathVariable String id) {
		Optional<User> oUser = userService.findById(id);		
		if(oUser.isPresent()) {
			return new UserDTO(oUser.get());
		}
		return new UserDTO();
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) throws Exception {
		Optional<User> oUser = userService.findById(id);
		if(oUser.isPresent()) {
			userService.delete(new User(id));
		} else {
			throw new Exception("The user with id("+id+") does not exist");
		}
	}
	
	@PostMapping
	public void insert(@RequestBody UserDTO userDTO) throws Exception {		
		Optional<User> oUser = userService.findById(userDTO.getId());		
		if(oUser.isPresent()) {
			throw new Exception("The user already exists");  
		}		
		userService.insert(new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail(), null));
	}
	
	@PutMapping
	public void update(@RequestBody UserDTO userDTO) throws Exception {		
		Optional<User> oUser = userService.findById(userDTO.getId());		
		if(!oUser.isPresent()) {
			throw new Exception("The user with id("+userDTO.getId()+") does not exist");  
		}		
		userService.update(new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail(), oUser.get().getUserTasks()));
	}

}
