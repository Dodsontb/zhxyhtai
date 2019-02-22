package com.zhxy.domain;

import java.util.Date;
import java.util.List;

public class Notice {
    private Integer noticeId;

    private Integer uid;

    private String ncontent;

    private Integer typeid;

    private String read;

    private String headline;

    private Date ntime;

    private Integer nstate;

    private Integer target;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;
    
    private Noticetype type;
    
    private CpUser cp_user;
    
    private List<Clazz> clazzs;
    
    public List<Clazz> getClazzs() {
		return clazzs;
	}

	public void setClazzs(List<Clazz> clazzs) {
		this.clazzs = clazzs;
	}

	public List<NoticeRelation> getNoticerelation() {
		return noticerelation;
	}

	public void setNoticerelation(List<NoticeRelation> noticerelation) {
		this.noticerelation = noticerelation;
	}

	private List<NoticeRelation> noticerelation;
    
    public CpUser getCp_user() {
		return cp_user;
	}

	public void setCp_user(CpUser cp_user) {
		this.cp_user = cp_user;
	}

	public Noticetype getType() {
		return type;
	}

	public void setType(Noticetype type) {
		this.type = type;
	}

	public List<Noticeimg> getImgs() {
		return imgs;
	}

	public void setImgs(List<Noticeimg> imgs) {
		this.imgs = imgs;
	}

	private List<Noticeimg> imgs;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Date getNtime() {
        return ntime;
    }

    public void setNtime(Date ntime) {
        this.ntime = ntime;
    }

    public Integer getNstate() {
        return nstate;
    }

    public void setNstate(Integer nstate) {
        this.nstate = nstate;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
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