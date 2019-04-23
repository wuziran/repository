package com.guigu.git.pojo;

public class QueryVO {
	private String startDate;
	private String stopDate;
	private String id;
	private int pageNum;
	private int maxPage;
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStopDate() {
		return stopDate;
	}
	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public QueryVO(String startDate, String stopDate, String id) {
		super();
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.id = id;
	}
	public QueryVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
