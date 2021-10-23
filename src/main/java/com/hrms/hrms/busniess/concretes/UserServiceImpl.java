package com.hrms.hrms.busniess.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.busniess.abstracts.UsersService;
import com.hrms.hrms.dataAccess.abstracts.UsersDao;
import com.hrms.hrms.entities.abstracts.Users;

@Service
public class UserServiceImpl implements UsersService{
	
	private UsersDao userDao;
	
	@Autowired
	public UserServiceImpl(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}



	@Override
	public List<Users> getAll() {
		return null;
	}
	
}
