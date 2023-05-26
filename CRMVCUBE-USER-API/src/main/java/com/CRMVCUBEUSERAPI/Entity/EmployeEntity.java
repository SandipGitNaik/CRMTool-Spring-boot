package com.CRMVCUBEUSERAPI.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name="employe")
public class EmployeEntity {
@Id
@Column(name="Emp_ID")
private int Emp_ID;
@Column(name="emp_first_name")
private String emp_first_name;
@Column(name="emp_last_name")
private String emp_last_name;
@Column(name="emp_contact_no")
private String emp_contact_no;
@Column(name="emp_email")
private String emp_email;
@Column(name="emp_designation")
private String emp_designation;
@Column (name="emp_qulification")
private String emp_qulification;
@Column(name="emp_ssc_mark")
private String emp_ssc_mark;
@Column(name="emp_hsc_mark")
private String emp_hsc_mark;
@Column(name="emp_graduation")
private String emp_graduation;
@Column(name="emp_pg")
private String emp_pg;
@Column(name="emp_gender")
private String emp_gender;
@Column(name="emp_created_date")
private String emp_created_date;
@Column(name="emp_updated_date")
private String emp_updated_date;
@Column(name="emp_pass")
private String emp_pass;
public int getEmp_ID() {
	return Emp_ID;
}
public void setEmp_ID(int emp_ID) {
	Emp_ID = emp_ID;
}
public String getEmp_first_name() {
	return emp_first_name;
}
public void setEmp_first_name(String emp_first_name) {
	this.emp_first_name = emp_first_name;
}
public String getEmp_last_name() {
	return emp_last_name;
}
public void setEmp_last_name(String emp_last_name) {
	this.emp_last_name = emp_last_name;
}
public String getEmp_contact_no() {
	return emp_contact_no;
}
public void setEmp_contact_no(String emp_contact_no) {
	this.emp_contact_no = emp_contact_no;
}
public String getEmp_email() {
	return emp_email;
}
public void setEmp_email(String emp_email) {
	this.emp_email = emp_email;
}
public String getEmp_designation() {
	return emp_designation;
}
public void setEmp_designation(String emp_designation) {
	this.emp_designation = emp_designation;
}
public String getEmp_qulification() {
	return emp_qulification;
}
public void setEmp_qulification(String emp_qulification) {
	this.emp_qulification = emp_qulification;
}
public String getEmp_ssc_mark() {
	return emp_ssc_mark;
}
public void setEmp_ssc_mark(String emp_ssc_mark) {
	this.emp_ssc_mark = emp_ssc_mark;
}
public String getEmp_hsc_mark() {
	return emp_hsc_mark;
}
public void setEmp_hsc_mark(String emp_hsc_mark) {
	this.emp_hsc_mark = emp_hsc_mark;
}
public String getEmp_graduation() {
	return emp_graduation;
}
public void setEmp_graduation(String emp_graduation) {
	this.emp_graduation = emp_graduation;
}
public String getEmp_pg() {
	return emp_pg;
}
public void setEmp_pg(String emp_pg) {
	this.emp_pg = emp_pg;
}
public String getEmp_gender() {
	return emp_gender;
}
public void setEmp_gender(String emp_gender) {
	this.emp_gender = emp_gender;
}
public String getEmp_created_date() {
	return emp_created_date;
}
public void setEmp_created_date(String emp_created_date) {
	this.emp_created_date = emp_created_date;
}
public String getEmp_updated_date() {
	return emp_updated_date;
}
public void setEmp_updated_date(String emp_updated_date) {
	this.emp_updated_date = emp_updated_date;
}
public String getEmp_pass() {
	return emp_pass;
}
public void setEmp_pass(String emp_pass) {
	this.emp_pass = emp_pass;
}




}
