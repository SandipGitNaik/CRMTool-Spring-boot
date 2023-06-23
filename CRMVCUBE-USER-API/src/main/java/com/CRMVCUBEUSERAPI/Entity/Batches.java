package com.CRMVCUBEUSERAPI.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="batches")
public class Batches {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long batch_id;
	@Column(name="batch_Name")
	private String batch_Name;
	@Column(name="batch_Trainer_Name")
	private String batch_Trainer_Name;
	@Column(name="batch_Core")
	private String batch_Core;
	@Column(name="batch_Time")
	private String batch_Time;
	@Column(name="batch_Strength")
	private int batch_Strength;
	@Column(name="batch_Created_Person")
	private String batch_Created_Person;
	@Column(name="batch_created_Date")
	private String batch_created_Date;
	@Column(name="batch_End_Date")
	private String batch_End_Date;
	public long getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(long batch_id) {
		this.batch_id = batch_id;
	}
	public String getBatch_Name() {
		return batch_Name;
	}
	public void setBatch_Name(String batch_Name) {
		this.batch_Name = batch_Name;
	}
	public String getBatch_Trainer_Name() {
		return batch_Trainer_Name;
	}
	public void setBatch_Trainer_Name(String batch_Trainer_Name) {
		this.batch_Trainer_Name = batch_Trainer_Name;
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
	public Batches() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBatch_Strength(int batch_Strength) {
		this.batch_Strength = batch_Strength;
	}
	public String getBatch_Created_Person() {
		return batch_Created_Person;
	}
	public void setBatch_Created_Person(String batch_Created_Person) {
		this.batch_Created_Person = batch_Created_Person;
	}
	public String getBatch_created_Date() {
		return batch_created_Date;
	}
	public void setBatch_created_Date(String batch_created_Date) {
		this.batch_created_Date = batch_created_Date;
	}
	public String getBatch_End_Date() {
		return batch_End_Date;
	}
	public void setBatch_End_Date(String batch_End_Date) {
		this.batch_End_Date = batch_End_Date;
	}

}
