package com.CRMVCUBEUSERAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="enquiry")
public class Enquiry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="enquiry_id")
	private long enquiry_id;
	@Column(name="full_Name")
	private String full_Name;
	@Column(name="mobile")
	private String mobile;
	@Column(name="email_id")
	private String email_id;
	@Column(name="qualification")
	private String qualification;
	@Column(name="course")
	private String course;
	@Column(name="year_of_passing")
	private String year_of_passing;
	@Column(name="created_date")
	private String created_date;
	@Column(name="updated_date")
	private String updated_date;
	public long getEnquiry_id() {
		return enquiry_id;
	}
	public void setEnquiry_id(long enquiry_id) {
		this.enquiry_id = enquiry_id;
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
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getYear_of_passing() {
		return year_of_passing;
	}
	public void setYear_of_passing(String year_of_passing) {
		this.year_of_passing = year_of_passing;
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
