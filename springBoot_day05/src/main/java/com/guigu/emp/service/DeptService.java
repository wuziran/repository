package com.guigu.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.emp.dao.DeptMapper;
import com.guigu.emp.pojo.Dept;
import com.guigu.emp.pojo.DeptExample;

@Service
public class DeptService {
	@Autowired
	private DeptMapper mapper;
	public List<Dept> findDept(){
		return  mapper.selectByExample(new DeptExample());
	}
}
