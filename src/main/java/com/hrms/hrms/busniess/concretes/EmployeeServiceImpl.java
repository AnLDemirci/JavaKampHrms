package com.hrms.hrms.busniess.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.busniess.abstracts.EmployeeService;
import com.hrms.hrms.dataAccess.abstracts.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	
	

}
