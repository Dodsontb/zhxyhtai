package com.zhxy.domain;

import java.util.List;

public class HxkPageBean<E> {

	private String name;
	private int typeid;
	private int currpage;
	private int pagecount;
	private int pagesize;
	private int pagenum;
	private List<E> lists;
	private int start;
	private int prevpage;
	private int nextpage;
	
	public int getPrevpage() {
		return prevpage;
	}
	public void setPrevpage(int prevpage) {
		this.prevpage = prevpage;
	}
	public int getNextpage() {
		return nextpage;
	}
	public void setNextpage(int nextpage) {
		this.nextpage = nextpage;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public List<E> getLists() {
		return lists;
	}
	public void setLists(List<E> lists) {
		this.lists = lists;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public int getCurrpage() {
		return currpage;
	}
	public void setCurrpage(int currpage) {
		this.currpage = currpage;
	}
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount=pagecount;
		this.pagenum=pagecount%pagesize==0?pagecount/pagesize:(pagecount/pagesize)+1;
		this.prevpage=currpage-1;
		this.nextpage=currpage+1;
		this.nextpage=nextpage>pagenum?1:nextpage;
		this.prevpage=prevpage<=0?pagenum:prevpage;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getPagenum() {
		return pagenum;
	}
	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}
	
	public HxkPageBean() {
		this.pagesize=3;
	}
	
	public HxkPageBean(String name,int typeid,int currpage) {
		this();
		this.name=name;
		this.typeid=typeid;
		this.currpage=currpage;
		this.start=(currpage-1)*pagesize;
		this.start=start<=0?0:start;
	}
	
}
