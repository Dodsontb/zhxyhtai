package com.zhxy.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Yuangongqingjia {
	
    private Integer id;

    private Integer staffid;

    private String qingjiareason;

    private String qingjiatime;

    private Integer qingjiastatus;

    private Date date;
    
    private String time;
    
    private String dateStr;
    
    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    
    private CpStaff staffName;
    
    private Qingjiatype qingjiaStatus;
    
    private CpPosition posi;
    
    public CpPosition getPosi() {
		return posi;
	}

	public void setPosi(CpPosition posi) {
		this.posi = posi;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTime() {
		return time;
	}

	public void setTime(Date date) {
		SimpleDateFormat  datatime =  new SimpleDateFormat("yyyy年MM月dd日");
		this.time = datatime.format(date);
	}
    
	public Qingjiatype getQingjiaStatus() {
		return qingjiaStatus;
	}

	public void setQingjiaStatus(Qingjiatype qingjiaStatus) {
		this.qingjiaStatus = qingjiaStatus;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

    public CpStaff getStaffName() {
		return staffName;
	}

	public void setStaffName(CpStaff staffName) {
		this.staffName = staffName;
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

    public String getQingjiareason() {
        return qingjiareason;
    }

    public void setQingjiareason(String qingjiareason) {
        this.qingjiareason = qingjiareason;
    }

    public String getQingjiatime() {
        return qingjiatime;
    }

    public void setQingjiatime(String qingjiatime) {
        this.qingjiatime = qingjiatime;
    }

    public Integer getQingjiastatus() {
        return qingjiastatus;
    }

    public void setQingjiastatus(Integer qingjiastatus) {
        this.qingjiastatus = qingjiastatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
        this.setTime(date);
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }
}