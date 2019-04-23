package com.guigu.emp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.emp.pojo.Dept;
import com.guigu.emp.pojo.Emp;
import com.guigu.emp.pojo.QueryVO;
import com.guigu.emp.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService es;
	@RequestMapping("findEmp")
	public Map<String, Object> findEmp(QueryVO v,Dept d,Emp e,HttpSession session,int rows,int page){
		v.setD(d);
		v.setE(e);
		v.setPageNum((page-1)*rows);
		v.setMaxPage(rows);
		List<Emp> list = es.findEmp(v);
		Map<String, Object> map=new HashMap<>();
		map.put("rows", list);
		map.put("total", es.count(v));
		return map;
	}
}
