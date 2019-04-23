package com.guigu.emp.pojo;

public class QueryVO {
	private int pageNum;
	private int MaxPage;
	private Dept d;
	private Emp e;
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getMaxPage() {
		return MaxPage;
	}
	public void setMaxPage(int maxPage) {
		MaxPage = maxPage;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public Emp getE() {
		return e;
	}
	public void setE(Emp e) {
		this.e = e;
	}
	public QueryVO(int pageNum, int maxPage, Dept d, Emp e) {
		super();
		this.pageNum = pageNum;
		MaxPage = maxPage;
		this.d = d;
		this.e = e;
	}
	public QueryVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
