package com.zhxy.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Studentassignment {
    private Integer ljxtid;

    private String ljxtitle;

    private String ljxclass;

    private String ljxclasses;

    private Date ljxdatetime;

    private String ljxdate;
    
    private String ljxtime;

	private Integer ljxuid;

    private Integer ljxtype;

    private String ljxwenjid;

    private Integer ljxjid;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;
    
    private List<WhetherAccomplish> list;
    
    private String yesno;
    
    private int no;
    
    private int yes;
    
    private List<AssignmentPutOff> asslist;

    public List<AssignmentPutOff> getAsslist() {
		return asslist;
	}

	public void setAsslist(List<AssignmentPutOff> asslist) {
		this.asslist = asslist;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getYes() {
		return yes;
	}

	public void setYes(int yes) {
		this.yes = yes;
	}

	public String getYesno() {
		return yesno;
	}

	public void setYesno(String yesno) {
		this.yesno = yesno;
	}

	public Integer getLjxtid() {
        return ljxtid;
    }

    public void setLjxtid(Integer ljxtid) {
        this.ljxtid = ljxtid;
    }

    public String getLjxtitle() {
        return ljxtitle;
    }

    public void setLjxtitle(String ljxtitle) {
        this.ljxtitle = ljxtitle;
    }

    public String getLjxclass() {
        return ljxclass;
    }

    public void setLjxclass(String ljxclass) {
        this.ljxclass = ljxclass;
    }

    public String getLjxclasses() {
        return ljxclasses;
    }

    public void setLjxclasses(String ljxclasses) {
        this.ljxclasses = ljxclasses;
    }

    public String getLjxdatetime() {
    	return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ljxdatetime);
    }

    public void setLjxdatetime(Date ljxdatetime) {
        this.ljxdatetime = ljxdatetime;
    }

    public String getLjxdate() {
        return ljxdate;
    }

    public void setLjxdate(String ljxdate) {
        this.ljxdate = ljxdate;
    }

    public String getLjxTime() {
    	return ljxtime;
    }

    public void setLjxtime(String ljxtime) {
        this.ljxtime = ljxtime;
    }

    public Integer getLjxuid() {
        return ljxuid;
    }

    public void setLjxuid(Integer ljxuid) {
        this.ljxuid = ljxuid;
    }

    public Integer getLjxtype() {
        return ljxtype;
    }

    public void setLjxtype(Integer ljxtype) {
        this.ljxtype = ljxtype;
    }

    public String getLjxwenjid() {
        return ljxwenjid;
    }

    public void setLjxwenjid(String ljxwenjid) {
        this.ljxwenjid = ljxwenjid;
    }

    public Integer getLjxjid() {
        return ljxjid;
    }

    public void setLjxjid(Integer ljxjid) {
        this.ljxjid = ljxjid;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
    	if(null!=name1) {
            this.name1 = name1.length()>0?name1:null;
    	}
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
    
    public List<WhetherAccomplish> getList() {
		return list;
	}

	public void setList(List<WhetherAccomplish> list) {
		this.list = list;
	}
}