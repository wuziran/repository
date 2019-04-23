package com.guigu.emp.service.tl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.emp.dao.EmpMapper;
import com.guigu.emp.pojo.Emp;

@Service
public class EmpImpol implements EmpaddService {

	@Autowired
	private EmpMapper dao;

	public int Empadd(Emp record) {
		int empadd = dao.Empadd(record);
		return empadd;
	}

	

	
	
}
