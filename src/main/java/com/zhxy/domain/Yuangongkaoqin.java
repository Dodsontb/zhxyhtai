package com.zhxy.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Yuangongkaoqin {
    private Integer id;

    private Integer staffid;

    private Integer kaoqinstatus;

    private Date date;

    private Integer positionid;

    private String name5;
    
    private String time;
    
    
    public String getTime() {
		return time;
	}

	public void setTime(Date date) {
		SimpleDateFormat  datatime =  new SimpleDateFormat("yyyy年MM月dd日");
		this.time = datatime.format(date);
	}

	private CpStaff stafname;
    
    private Statuastype status;
    
    private CpPosition cpname;
    
    
    

	public CpStaff getStafname() {
		return stafname;
	}

	public void setStafname(CpStaff stafname) {
		this.stafname = stafname;
	}

	public Statuastype getStatus() {
		return status;
	}

	public void setStatus(Statuastype status) {
		this.status = status;
	}

	public CpPosition getCpname() {
		return cpname;
	}

	public void setCpname(CpPosition cpname) {
		this.cpname = cpname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStaffid() {
		return staffid;
	}

	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}

	public Integer getKaoqinstatus() {
		return kaoqinstatus;
	}

	public void setKaoqinstatus(Integer kaoqinstatus) {
		this.kaoqinstatus = kaoqinstatus;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		this.setTime(date);
	}

	public Integer getPositionid() {
		return positionid;
	}

	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}

	public String getName5() {
		return name5;
	}

	public void setName5(String name5) {
		this.name5 = name5;
	}
    
    


}