package com.guigu.git.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.git.pojo.Account;
import com.guigu.git.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService as;
	@RequestMapping("login")
	public @ResponseBody int login(Account a,HttpSession session,HttpServletResponse response) throws IOException{
		int login = as.login(a);
		if(a.getCardno()==null||a.getCardno().trim().length()==0){
			session.removeAttribute("cardno");
			session.removeAttribute("name");
			response.sendRedirect("login.html");
		}else{
			if(login>0){
				int s = as.findByCardno(a.getCardno());
				if(s==0){
					login=3;
				}else{
					session.setAttribute("name", a.getCardno());
					session.setAttribute("cardno", a.getCardno());
				}
			}
		}
		return login;
	}
	@RequestMapping("/selectMoney.do")
	public @ResponseBody String select(HttpSession session){
		String balance = as.findMoney((String)session.getAttribute("cardno"));
		return balance;
	}
	@RequestMapping("getname")
	public @ResponseBody String getname(HttpSession session){
		String name=(String)session.getAttribute("name");
		return name;
	}
	@RequestMapping("/selectPwd.do")
	public @ResponseBody String selectPwd(String password,HttpSession session){
		Account a= as.findPwd((String)session.getAttribute("cardno"));
		if(a.getPassword().equals(password)){
			return "1";
		}else{
			return "0";
		}
		
	}
	@RequestMapping("/updatePwd.do")
	public @ResponseBody int updatePwd(Account a,HttpSession session){
		String c = (String) session.getAttribute("cardno");
		a.setCardno(c);
		int count = as.updatePwd(a);
		return count;
	}
	@RequestMapping("/transferAccounts.do")
	public @ResponseBody int transferAccounts(Account a,HttpSession session){
		String c = (String) session.getAttribute("cardno");
		int count = as.transferAccounts(c, a.getBalance(), a.getCardno());
		return count;
	}
	@RequestMapping("update1")
	public @ResponseBody int update11(String cardno){
		int count = as.up(cardno);
		return count;
	}
}
