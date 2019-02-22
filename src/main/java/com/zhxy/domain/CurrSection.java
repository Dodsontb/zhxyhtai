package com.zhxy.domain;

import java.util.Date;

public class CurrSection {
    private Integer id;

	private Integer cid;

	private Integer sid;

	private Date join;

	private Date leave;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Date getJoin() {
		return join;
	}

	public void setJoin(Date join) {
		this.join = join;
	}

	public Date getLeave() {
		return leave;
	}

	public void setLeave(Date leave) {
		this.leave = leave;
	}

	
}