package com.zhxy.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Studentassignment {
    private Integer ljxtid;

    private String ljxtitle;

    private String ljxclass;

    private String ljxclasses;

    private Date ljxdatetime;

<<<<<<< Upstream, based on origin/ljx1.1
    private String ljxdate;
=======
    private Date ljxdate;
>>>>>>> 30c53b0 数据库增加一张表

<<<<<<< Upstream, based on origin/ljx1.1
    private String ljxtime;
=======
    private Date ljxtime;
>>>>>>> 30c53b0 数据库增加一张表

    private Integer ljxuid;

    private Integer ljxtype;

    private String ljxwenjid;

    private Integer ljxjid;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

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

<<<<<<< Upstream, based on origin/ljx1.1
    public String getLjxdatetime() {
    	return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ljxdatetime);
=======
    public Date getLjxdatetime() {
        return ljxdatetime;
>>>>>>> 30c53b0 数据库增加一张表
    }

    public void setLjxdatetime(Date ljxdatetime) {
        this.ljxdatetime = ljxdatetime;
    }

<<<<<<< Upstream, based on origin/ljx1.1
    public String getLjxdate() {
=======
    public Date getLjxdate() {
>>>>>>> 30c53b0 数据库增加一张表
        return ljxdate;
    }

<<<<<<< Upstream, based on origin/ljx1.1
    public void setLjxdate(String ljxdate) {
=======
    public void setLjxdate(Date ljxdate) {
>>>>>>> 30c53b0 数据库增加一张表
        this.ljxdate = ljxdate;
    }

<<<<<<< Upstream, based on origin/ljx1.1

    public String getLjxTime() {
    	return ljxtime;

=======
    public Date getLjxtime() {
        return ljxtime;
>>>>>>> 30c53b0 数据库增加一张表
    }

<<<<<<< Upstream, based on origin/ljx1.1
    public void setLjxtime(String ljxtime) {
=======
    public void setLjxtime(Date ljxtime) {
>>>>>>> 30c53b0 数据库增加一张表
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
}