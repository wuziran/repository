package com.guigu.git.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guigu.git.dao.TransactionRecordMapper;
import com.guigu.git.pojo.Account;
import com.guigu.git.pojo.QueryVO;
import com.guigu.git.pojo.TransactionRecord;

@Service
@Transactional
public class TransactionService {
	@Autowired
	TransactionRecordMapper mapper;
	@Transactional
	public void add(Account a1,Account a2,double money){
		mapper.insert(new TransactionRecord(a1.getCardno(), money, 0.00, a1.getBalance()-money, "消费"));
		mapper.insert(new TransactionRecord(a2.getCardno(), 0.00, money, a2.getBalance()+money, "进账"));
	}
	@Transactional
	public List<TransactionRecord> find(QueryVO v){
		List<TransactionRecord> list = mapper.select(v);
		return list;
	}
	@Transactional
	public int count(QueryVO v){
		int count = mapper.count(v);
		return count;
	}
}	
