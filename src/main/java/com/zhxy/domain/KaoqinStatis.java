package com.zhxy.domain;

public class KaoqinStatis {
	private String date;
	private Integer sta1;
	private Integer sta2;
	private Integer sta3;
	private Integer sta4;
	private Integer unnormal;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getSta1() {
		return sta1;
	}
	public void setSta1(Integer sta1) {
		this.sta1 = sta1;
	}
	public Integer getSta2() {
		return sta2;
	}
	public void setSta2(Integer sta2) {
		this.sta2 = sta2;
	}
	public Integer getSta3() {
		return sta3;
	}
	public void setSta3(Integer sta3) {
		this.sta3 = sta3;
	}
	public Integer getSta4() {
		return sta4;
	}
	public void setSta4(Integer sta4) {
		this.sta4 = sta4;
	}
	public Integer getUnnormal() {
		return unnormal;
	}
	public void setUnnormal(Integer unnormal) {
		this.unnormal = unnormal;
	}
	public Integer getCount1() {
		this.unnormal = sta2 + sta3 + sta4;
		return unnormal;
	}
	public Integer getCount2() {
		if (sta2 + sta3 + sta4 == 0) {
			return 1;
		}else {
			return 0;			
		}
	}

}
