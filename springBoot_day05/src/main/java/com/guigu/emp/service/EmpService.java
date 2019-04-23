package com.guigu.emp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.emp.dao.EmpMapper;
import com.guigu.emp.dao.EmpUpdateMapper;
import com.guigu.emp.pojo.Dept;
import com.guigu.emp.pojo.Emp;
import com.guigu.emp.pojo.QueryVO;

@Service
public class EmpService {
	@Autowired
	private EmpMapper mapper;
	@Autowired
	private EmpUpdateMapper updatemapper;
	
	public List<Emp> findEmp(QueryVO vo){
		List<Emp> list = mapper.select(vo);
		return list;
	}
	public int count(QueryVO vo){
		int count = mapper.count(vo);
		return count;
	}
	
	public Map Empselect(Emp emp){
		Map map = new HashMap<>();
		List<Dept> deptselect = updatemapper.Deptselect();
		Emp empselect = updatemapper.Empselect(emp);
		map.put("list", deptselect);
		map.put("emp", empselect);
		return map;
	}
}
