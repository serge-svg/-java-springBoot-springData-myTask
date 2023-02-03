package com.svg.java.spring.springboot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.svg.java.spring.springboot.web.model.User;
import com.svg.java.spring.springboot.web.services.UserService;

@Controller
@RequestMapping("/mytask")
public class UserController {
	
	private UserService userService;
		
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping({"/users", "/"})
	public String findAll(Model model) {
		model.addAttribute("users", userService.findAll());
		return "listOfUsers";		
	}
	
	@GetMapping("/addUserForm")
	public String addForm() {
		return "addUserForm";
	}
	
	@GetMapping("/deleteUser")
	public String delete(Model model, @RequestParam String id) {		
		userService.delete(new User(id));
		model.addAttribute("users", userService.findAll());
		return "listOfUsers";	
	}
	
	@PostMapping("/insertUser")
	public String insert(Model model, User user) {
		userService.insert(user);
		model.addAttribute("users", userService.findAll());
		return "listOfUsers";	
	}

	@GetMapping("/updateUserForm")
	public String updateForm(Model model, @RequestParam String id) {	
		model.addAttribute("user", userService.findById(id));
		return "updateUserForm";
	}
	
	@GetMapping("/updateUser")
	public String update(Model model, User user) {
		userService.update(user);
		model.addAttribute("users", userService.findAll());
		return "listOfUsers";	
	}
}
