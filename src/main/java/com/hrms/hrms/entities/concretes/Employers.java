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
@Table(name="Employers")
public class Employers extends Users{
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="WebSite")
	private String webSite;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;

	public Employers() {}

	public Employers(String companyName, String webSite, String phoneNumber) {
		super();
		this.companyName = companyName;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
	}	
}
