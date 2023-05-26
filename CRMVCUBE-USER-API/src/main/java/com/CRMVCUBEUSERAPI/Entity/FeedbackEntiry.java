package com.CRMVCUBEUSERAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedbackEntiry {
@Id
@Column(name="fedback_id")
private long fedback_id;


@Column(name="course_name")
private String course_name;
@Column(name="faculty")
private String faculty;
@Column(name="class_Experience")
private String class_Experience;
@Column(name="full_Name")
private String full_Name;
@Column(name="mobile")
private String mobile;
@Column(name="suggestion")
private String suggestion;
@Column(name="created_date")
private String created_date;
@Column(name="updated_date")
private String updated_date;

public long getFedback_id() {
	return fedback_id;
}
public void setFedback_id(long fedback_id) {
	this.fedback_id = fedback_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}
public String getClass_Experience() {
	return class_Experience;
}
public void setClass_Experience(String class_Experience) {
	this.class_Experience = class_Experience;
}
public String getFull_Name() {
	return full_Name;
}
public void setFull_Name(String full_Name) {
	this.full_Name = full_Name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getSuggestion() {
	return suggestion;
}
public void setSuggestion(String suggestion) {
	this.suggestion = suggestion;
}
public String getCreated_date() {
	return created_date;
}
public void setCreated_date(String created_date) {
	this.created_date = created_date;
}
public String getUpdated_date() {
	return updated_date;
}
public void setUpdated_date(String updated_date) {
	this.updated_date = updated_date;
}



}
