package com.guigu.emp.controller.tl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.emp.pojo.Dept;
import com.guigu.emp.service.tl.DeptService;

@RestController
public class DeptselController {

	@Autowired
	private DeptService dao;
	
	
	@RequestMapping("deptsel")
	public List<Dept> deptsel(){
		List<Dept> deptsel = dao.deptsel();
		System.out.println(deptsel);
		return deptsel;
	}
}
