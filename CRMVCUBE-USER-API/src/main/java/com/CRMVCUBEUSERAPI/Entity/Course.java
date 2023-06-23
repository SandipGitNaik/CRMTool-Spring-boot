package com.CRMVCUBEUSERAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long course_Id;
	@Column(name="course_Name")
	private String course_Name;
	@Column(name="course_Trainer_Name")
	private String course_Trainer_Name;
	@Column(name="course_Fee")
	private String course_Fee;
	@Column(name="course_Duration")
	private String course_Duration;
	@Column(name="course_Code")
	private int course_Code;
		public long getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(long course_Id) {
		this.course_Id = course_Id;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	
	public String getCourse_Trainer_Name() {
		return course_Trainer_Name;
	}
	public void setCourse_Trainer_Name(String course_Trainer_Name) {
		this.course_Trainer_Name = course_Trainer_Name;
	}
	public String getCourse_Fee() {
		return course_Fee;
	}
	public void setCourse_Fee(String course_Fee) {
		this.course_Fee = course_Fee;
	}
	public String getCourse_Duration() {
		return course_Duration;
	}
	public void setCourse_Duration(String course_Duration) {
		this.course_Duration = course_Duration;
	}
	public int getCourse_Code() {
		return course_Code;
	}
	public void setCourse_Code(int course_Code) {
		this.course_Code = course_Code;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
