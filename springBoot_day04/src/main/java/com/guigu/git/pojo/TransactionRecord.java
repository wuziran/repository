package com.guigu.git.pojo;

import java.util.Date;

public class TransactionRecord {
    private Integer id;

    private String cardno;

    private Date transactionDate;

    private Double expense;

    private Double income;

    private Double balance;

    private String transactionType;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getExpense() {
        return expense;
    }

    public void setExpense(Double expense) {
        this.expense = expense;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType == null ? null : transactionType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	public TransactionRecord(String cardno, Double expense, Double income, Double balance, String transactionType) {
		super();
		this.cardno = cardno;
		this.expense = expense;
		this.income = income;
		this.balance = balance;
		this.transactionType = transactionType;
	}

	public TransactionRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}