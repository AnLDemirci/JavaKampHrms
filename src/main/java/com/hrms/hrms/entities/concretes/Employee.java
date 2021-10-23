package com.hrms.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hrms.hrms.entities.abstracts.Users;

import lombok.Data;

@Data
@Entity
@Table(name="Employee")
public class Employee extends Users{

	@Column(name="Name")
	private String name;
	
	@Column(name="Surname")
	private String surname;
	
	@Column(name="TcNo")
	private String tcNo;
	
	@Column(name="BirthOfYear")
	private Date birthOfYear;

	public Employee() {}

	public Employee(String name, String surname, String tcNo, Date birthOfYear) {
		super();
		this.name = name;
		this.surname = surname;
		this.tcNo = tcNo;
		this.birthOfYear = birthOfYear;
	}
	
	
	
}
