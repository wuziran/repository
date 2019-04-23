package com.guigu.git.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.git.pojo.QueryVO;
import com.guigu.git.pojo.TransactionRecord;
import com.guigu.git.service.TransactionService;

@RestController
public class TransactionRecordController {
	@Autowired
	TransactionService ts;
	@RequestMapping("find")
	public @ResponseBody Map<String, Object> find(QueryVO v,HttpSession session,int rows,int page){
		String cardno =(String) session.getAttribute("cardno");
		v.setId(cardno);
		v.setPageNum((page-1)*rows);
		v.setMaxPage(rows);
		List<TransactionRecord> list = ts.find(v);
		Map<String, Object> map=new HashMap<>();
		map.put("rows", list);
		map.put("total", ts.count(v));
		return map;
	}
}
