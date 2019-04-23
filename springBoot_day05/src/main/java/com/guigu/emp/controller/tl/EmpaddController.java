package com.guigu.emp.controller.tl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.emp.pojo.Emp;
import com.guigu.emp.service.tl.EmpaddService;

@RestController
public class EmpaddController {

	@Autowired
	private EmpaddService dao;
	
	@RequestMapping("Empadd")
	public int Empadd(String id,String name,String sex,String birthday,String phone,String address,String zhiwu,int dept) {
		
		System.out.println(id+name+sex+birthday+phone+address+zhiwu+dept);
		int empadd = dao.Empadd(new Emp(id,name,sex,birthday,phone,address,zhiwu,dept));
		
		return empadd;
	}
	
}
