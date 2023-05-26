package com.CRMVCUBEUSERAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="register")
public class RegisterEntity {
@Id
@Column(name="reg_Id")
private int reg_Id;
@Column(name="reg_First_Name")
private String reg_First_Name;
@Column(name="reg_Last_Name")
private String reg_Last_Name;
@Column(name="reg_Email_Id")
private String reg_Email_Id;
@Column(name="reg_Phone_No")
private String reg_Phone_No;
@Column(name="reg_Gender")
private String reg_Gender;
@Column(name="reg_Course")
private String reg_Course;
@Column(name="reg_State")
private String reg_State;
@Column(name="reg_Mode_Of_Training")
private String reg_Mode_Of_Training;
public int getReg_Id() {
	return reg_Id;
}
public void setReg_Id(int reg_Id) {
	this.reg_Id = reg_Id;
}
public String getReg_First_Name() {
	return reg_First_Name;
}
public void setReg_First_Name(String reg_First_Name) {
	this.reg_First_Name = reg_First_Name;
}
public String getReg_Last_Name() {
	return reg_Last_Name;
}
public void setReg_Last_Name(String reg_Last_Name) {
	this.reg_Last_Name = reg_Last_Name;
}
public String getReg_Email_Id() {
	return reg_Email_Id;
}
public void setReg_Email_Id(String reg_Email_Id) {
	this.reg_Email_Id = reg_Email_Id;
}
public String getReg_Phone_No() {
	return reg_Phone_No;
}
public void setReg_Phone_No(String reg_Phone_No) {
	this.reg_Phone_No = reg_Phone_No;
}
public String getReg_Gender() {
	return reg_Gender;
}
public void setReg_Gender(String reg_Gender) {
	this.reg_Gender = reg_Gender;
}
public String getReg_Course() {
	return reg_Course;
}
public void setReg_Course(String reg_Course) {
	this.reg_Course = reg_Course;
}
public String getReg_State() {
	return reg_State;
}
public void setReg_State(String reg_State) {
	this.reg_State = reg_State;
}
public String getReg_Mode_Of_Training() {
	return reg_Mode_Of_Training;
}
public void setReg_Mode_Of_Training(String reg_Mode_Of_Training) {
	this.reg_Mode_Of_Training = reg_Mode_Of_Training;
}



}
