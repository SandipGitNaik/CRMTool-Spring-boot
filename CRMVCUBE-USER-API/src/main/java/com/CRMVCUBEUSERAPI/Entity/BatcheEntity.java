package com.CRMVCUBEUSERAPI.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="batches")
public class BatcheEntity {
@Id
@Column(name="batch_id")
private int batch_id;
@Column(name="batch_Name")
private String batch_Name;
@Column(name="batch_Trainer_name")
private String batch_Trainer_name;
@Column (name="batch_Core")
private String batch_Core;
@Column(name="batch_Time")
private String batch_Time;
@Column(name="batch_Strength")
private int batch_Strength;
@Column(name="batch_created_Person")
private String batch_created_Person;
@Column(name="batch_CreatedDate")
private String batch_CreatedDate;
@Column(name="batch_End_Date")
private String batch_End_Date;
public int getBatch_id() {
	return batch_id;
}
public void setBatch_id(int batch_id) {
	this.batch_id = batch_id;
}
public String getBatch_Name() {
	return batch_Name;
}
public void setBatch_Name(String batch_Name) {
	this.batch_Name = batch_Name;
}
public String getBatch_Trainer_name() {
	return batch_Trainer_name;
}
public void setBatch_Trainer_name(String batch_Trainer_name) {
	this.batch_Trainer_name = batch_Trainer_name;
}
public String getBatch_Core() {
	return batch_Core;
}
public void setBatch_Core(String batch_Core) {
	this.batch_Core = batch_Core;
}
public String getBatch_Time() {
	return batch_Time;
}
public void setBatch_Time(String batch_Time) {
	this.batch_Time = batch_Time;
}
public int getBatch_Strength() {
	return batch_Strength;
}
public BatcheEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public void setBatch_Strength(int batch_Strength) {
	this.batch_Strength = batch_Strength;
}
public String getBatch_created_Person() {
	return batch_created_Person;
}
public void setBatch_created_Person(String batch_created_Person) {
	this.batch_created_Person = batch_created_Person;
}
public String getBatch_CreatedDate() {
	return batch_CreatedDate;
}
public void setBatch_CreatedDate(String batch_CreatedDate) {
	this.batch_CreatedDate = batch_CreatedDate;
}
public String getBatch_End_Date() {
	return batch_End_Date;
}
public void setBatch_End_Date(String batch_End_Date) {
	this.batch_End_Date = batch_End_Date;
}

}
