package com.hrms.hrms.busniess.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Employers;
import com.hrms.hrms.entities.concretes.SystemPersonel;

public interface SystemPersonelService {
	DataResult<List<SystemPersonel>> getAll();
	Result add(SystemPersonel systemPersonel);
	DataResult<List<Employers>> getNewEmployers();
	Result setStatus(int employer_id, boolean status);
}
