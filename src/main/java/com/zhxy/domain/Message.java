package com.zhxy.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Message {
    private Integer messageId;

    private Integer uid;

    private String mcontent;

    private Date mtime;

    private Integer mstate;

    private Integer typeid;
    
    private String time;
    
  //接收者数组
    private int receiver; 
    
    public int getReceiver() {
		return receiver;
	}

	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public List<Messageimg> getImgs() {
		return imgs;
	}

	public void setImgs(List<Messageimg> imgs) {
		this.imgs = imgs;
	}

	public CpUser getCp_user() {
		return cp_user;
	}

	public void setCp_user(CpUser cp_user) {
		this.cp_user = cp_user;
	}

	private MessageType type;
    
    private List<Messageimg> imgs;
    
    private CpUser cp_user;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
    	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    	this.mtime = mtime;
        this.time=simpleDateFormat.format(mtime);
    }

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
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
    
    public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}