package com.zhxy.domain;

import java.util.Date;
import java.util.List;

public class Template {
    private Integer id;

    private String name;

    private Integer total;

    private Integer softtypeid;

    private String cquestionid;

    private String yquestionid;

    private String tquestionid;

    private String start;

    private Integer uid;

    private Date end;

    private String creation;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;
    
    private List<Cquestion> cquestion;
    
    private List<Tquestion> tquestion;
    
    private List<Yquestion> yquestion;
    
    public List<Cquestion> getCquestion() {
		return cquestion;
	}

	public void setCquestion(List<Cquestion> cquestion) {
		this.cquestion = cquestion;
	}

	public List<Tquestion> getTquestion() {
		return tquestion;
	}

	public void setTquestion(List<Tquestion> tquestion) {
		this.tquestion = tquestion;
	}

	public List<Yquestion> getYquestion() {
		return yquestion;
	}

	public void setYquestion(List<Yquestion> yquestion) {
		this.yquestion = yquestion;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSofttypeid() {
        return softtypeid;
    }

    public void setSofttypeid(Integer softtypeid) {
        this.softtypeid = softtypeid;
    }

    public String getCquestionid() {
        return cquestionid;
    }

    public void setCquestionid(String cquestionid) {
        this.cquestionid = cquestionid;
    }

    public String getYquestionid() {
        return yquestionid;
    }

    public void setYquestionid(String yquestionid) {
        this.yquestionid = yquestionid;
    }

    public String getTquestionid() {
        return tquestionid;
    }

    public void setTquestionid(String tquestionid) {
        this.tquestionid = tquestionid;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getCreation() {
        return creation;
    }

    public void setCreation(String creation) {
        this.creation = creation;
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