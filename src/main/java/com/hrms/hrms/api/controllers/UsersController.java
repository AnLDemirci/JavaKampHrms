package com.hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.busniess.abstracts.UsersService;
import com.hrms.hrms.entities.abstracts.Users;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UsersService usersService;

	@Autowired
	public UsersController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	
	@GetMapping("/getAll")
	public List<Users> getAll(){
		return this.usersService.getAll();
	}
	
	
}
