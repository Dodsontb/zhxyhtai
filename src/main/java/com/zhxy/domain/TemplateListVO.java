package com.zhxy.domain;

import java.util.Date;
import java.util.List;

public class TemplateListVO {
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

	    private Date creation;
	    
	    private String gradeName;
	    
	    private List<String> className;

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

		public Date getCreation() {
			return creation;
		}

		public void setCreation(Date creation) {
			this.creation = creation;
		}

		public String getGradeName() {
			return gradeName;
		}

		public void setGradeName(String gradeName) {
			this.gradeName = gradeName;
		}

		public List<String> getClassName() {
			return className;
		}

		public void setClassName(List<String> className) {
			this.className = className;
		}
	    
	    

}
