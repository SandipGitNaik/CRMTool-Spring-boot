package com.CRMVCUBEUSERAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employe")
public class LoginEntity {
@Id
@Column(name="emp_email")
private String emp_email;
@Column(name="emp_pass")
private String emp_pass;
public String getEmp_email() {
	return emp_email;
}
public void setEmp_email(String emp_email) {
	this.emp_email = emp_email;
}
public String getEmp_pass() {
	return emp_pass;
}
public void setEmp_pass(String emp_pass) {
	this.emp_pass = emp_pass;
} 


}
