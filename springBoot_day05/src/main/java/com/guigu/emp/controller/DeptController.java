package com.guigu.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.emp.pojo.Dept;
import com.guigu.emp.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService ds;
	@RequestMapping("findDept")
	public List<Dept> findDept(){
		return ds.findDept();
	} 
}
