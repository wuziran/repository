package com.guigu.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.emp.dao.EmpMapper;
import com.guigu.emp.pojo.Emp;
import com.guigu.emp.pojo.QueryVO;

@Service
public class EmpService {
	@Autowired
	private EmpMapper mapper;
	public List<Emp> findEmp(QueryVO vo){
		List<Emp> list = mapper.select(vo);
		return list;
	}
	public int count(QueryVO vo){
		int count = mapper.count(vo);
		return count;
	}
	public int count1(QueryVO vo){
		int count = mapper.count(vo);
		return count;
	}
}
