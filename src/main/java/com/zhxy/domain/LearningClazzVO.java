package com.zhxy.domain;

public class LearningClazzVO {
	
	private Integer id;
	private String name;
	private Integer maxScore;
	private Integer minScore;
	private Float avgScore;
	private String nearestTemplateStart;
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
	public Integer getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(Integer maxScore) {
		this.maxScore = maxScore;
	}
	public Integer getMinScore() {
		return minScore;
	}
	public void setMinScore(Integer minScore) {
		this.minScore = minScore;
	}
	public Float getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(Float avgScore) {
		this.avgScore = avgScore;
	}
	public String getNearestTemplateStart() {
		return nearestTemplateStart;
	}
	public void setNearestTemplateStart(String nearestTemplateStart) {
		this.nearestTemplateStart = nearestTemplateStart;
	}
	

}
