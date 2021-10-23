package com.hrms.hrms.busniess.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.busniess.abstracts.SystemPersonelService;
import com.hrms.hrms.dataAccess.abstracts.SystemPersonelDao;

@Service
public class SystemPersonelServiceImpl implements SystemPersonelService {
	private SystemPersonelDao systemPersonelDao;

	@Autowired
	public SystemPersonelServiceImpl(SystemPersonelDao systemPersonelDao) {
		super();
		this.systemPersonelDao = systemPersonelDao;
	}
	
	
}
