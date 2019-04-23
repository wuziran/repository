package com.guigu.emp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.guigu.emp.pojo.Dept;
import com.guigu.emp.pojo.Emp;

@Mapper
public interface EmpUpdateMapper {

	Emp Empselect(Emp emp);
	
	List<Dept> Deptselect();
	
	int Empupdate(Emp emp);
	
}
