package com.hrms.hrms.busniess.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.busniess.abstracts.EmployersService;
import com.hrms.hrms.dataAccess.abstracts.EmployersDao;

@Service
public class EmployersServiceImpl implements EmployersService{
	private EmployersDao employersDao;

	@Autowired
	public EmployersServiceImpl(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}
	
	

}
