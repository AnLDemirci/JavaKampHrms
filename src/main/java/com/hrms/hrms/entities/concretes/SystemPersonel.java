package com.hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hrms.hrms.entities.abstracts.Users;

import lombok.Data;

@Data
@Entity
@Table(name="SystemPersonel")
public class SystemPersonel extends Users{

	@Column(name="Name")
	private String name;
	
	@Column(name="Surname")
	private String surname;

	public SystemPersonel() {}
	
	public SystemPersonel(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	
}
