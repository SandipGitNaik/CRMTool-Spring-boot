package com.CRMVCUBEUSERAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="interview")
public class Interview {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long interview_id ;
	@Column(name="interview_company_name")
	private String interview_company_name;
	@Column(name="interview_role")
	private String interview_role;
	@Column(name="interview_eligibility")
	private String interview_eligibility;
	@Column(name="interview_location")
	private String interview_location;
	@Column(name="interview_type")
	private String interview_type;
	@Column(name="interview_package")
	private String interview_package;
	@Column(name="interview_mode")
	private String interview_mode;
	@Column(name="interview_deadline")
	private String interview_deadline;
	@Column(name="interview_experience")
	private String interview_experience;
	@Column(name="interview_date")
	private String interview_date;
	@Column(name="no_of_vacancies")
	private long no_of_vacancies;
	@Column(name="interview_course")
	private String interview_course;
	@Column(name="interview_created_data")
	private String interview_created_data;
	@Column(name="interview_updated_date")
	private String interview_updated_date;
	public long getInterview_id() {
		return interview_id;
	}
	public void setInterview_id(long interview_id) {
		this.interview_id = interview_id;
	}
	public String getInterview_company_name() {
		return interview_company_name;
	}
	public void setInterview_company_name(String interview_company_name) {
		this.interview_company_name = interview_company_name;
	}
	public String getInterview_role() {
		return interview_role;
	}
	public void setInterview_role(String interview_role) {
		this.interview_role = interview_role;
	}
	public String getInterview_eligibility() {
		return interview_eligibility;
	}
	public void setInterview_eligibility(String interview_eligibility) {
		this.interview_eligibility = interview_eligibility;
	}
	public String getInterview_location() {
		return interview_location;
	}
	public void setInterview_location(String interview_location) {
		this.interview_location = interview_location;
	}
	public String getInterview_type() {
		return interview_type;
	}
	public void setInterview_type(String interview_type) {
		this.interview_type = interview_type;
	}
	public String getInterview_package() {
		return interview_package;
	}
	public void setInterview_package(String interview_package) {
		this.interview_package = interview_package;
	}
	public String getInterview_mode() {
		return interview_mode;
	}
	public void setInterview_mode(String interview_mode) {
		this.interview_mode = interview_mode;
	}
	public String getInterview_deadline() {
		return interview_deadline;
	}
	public void setInterview_deadline(String interview_deadline) {
		this.interview_deadline = interview_deadline;
	}
	public String getInterview_experience() {
		return interview_experience;
	}
	public void setInterview_experience(String interview_experience) {
		this.interview_experience = interview_experience;
	}
	public String getInterview_date() {
		return interview_date;
	}
	public void setInterview_date(String interview_date) {
		this.interview_date = interview_date;
	}
	public long getNo_of_vacancies() {
		return no_of_vacancies;
	}
	public void setNo_of_vacancies(long no_of_vacancies) {
		this.no_of_vacancies = no_of_vacancies;
	}
	public String getInterview_course() {
		return interview_course;
	}
	public void setInterview_course(String interview_course) {
		this.interview_course = interview_course;
	}
	public String getInterview_created_data() {
		return interview_created_data;
	}
	public void setInterview_created_data(String interview_created_data) {
		this.interview_created_data = interview_created_data;
	}
	public String getInterview_updated_date() {
		return interview_updated_date;
	}
	public void setInterview_updated_date(String interview_updated_date) {
		this.interview_updated_date = interview_updated_date;
	}
	public Interview() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
