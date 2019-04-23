package com.guigu.git.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guigu.git.dao.AccountMapper;
import com.guigu.git.pojo.Account; 

@Service
@Transactional
public class AccountService {
	@Autowired
	AccountMapper mapper;
	@Autowired
	TransactionService ts;
	public int login(Account a){
		int aa = mapper.login(a);
		return aa;
	}
	public String findMoney(String cardno){
		String balance = mapper.findMoney(cardno);
		return balance;
	}
	public Account findPwd(String cardno){
		Account a = mapper.selectByPrimaryKey(cardno);
		return a;
	}
	@Transactional
	public int updatePwd(Account a){
		int count = mapper.updateByPrimaryKey(a);
		return count;
	}
	@Transactional
	public int transferAccounts(String cardno,double money,String cardno1){
		Account a = mapper.selectByPrimaryKey(cardno1);
		if(a!=null){
			if(a.getStatus()==1){
				Account a1 = mapper.selectByPrimaryKey(cardno);
				if(a1.getBalance()<money){
					return 2;
				}else{
					mapper.updateA(new Account(cardno, money));
					mapper.updateB(new Account(cardno1, money));
					ts.add(a1, a, money);
					return 3;
				}
			}else{
				return 1;
			}
		}else{
			return 0;
		}
	}
	@Transactional
	public int up(String cardno){
		int count = mapper.update1(cardno);
		return count;
	}
	public int findByCardno(String cardno){
		Account a = mapper.selectByPrimaryKey(cardno);
		return a.getStatus();
	}
}
