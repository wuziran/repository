package com.guigu.emp.service.tl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.emp.dao.DeptMapper;
import com.guigu.emp.pojo.Dept;

@Service
public class DeptImpol implements DeptService {

	@Autowired
	private DeptMapper dao;

	@Override
	public List<Dept> deptsel() {
		List<Dept> deptsel = dao.deptsel();
		return deptsel;
	}
	
	
	
}
