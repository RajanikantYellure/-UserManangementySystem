package com.bikkadIt.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="USER_ACCOUNTS")
public class UserAccounts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Id")
	private int id;
	
	@Column(name="User_Fname")
	private String fname;
	
	@Column(name="User_Lname")
	private String lname;
	
	@Column(name="User_Email")
	private String email;
	
	@Column(name="User_Password")
	private String password;
	
	@Column(name="User_Phno")
	private Long phno;
	
	@Column(name="User_Gender")
	private String gender;
	
	@Column(name="User_DOB")
	private Date dob;
	
	@Column(name="User_Country")
	private String country;
	
	@Column(name="User_State")
	private String state;
	
	@Column(name="User_City")
	private String city;
	
	@Column(name="Active_SW")
	private char active_sw;
	
	@Column(name="Created_Date",updatable = false)
	@CreationTimestamp
	private LocalDate createddate;
	
	@Column(name="Updated_Date",insertable = false)
	@UpdateTimestamp
	private LocalDate updateddate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public char getActive_sw() {
		return active_sw;
	}

	public void setActive_sw(char active_sw) {
		this.active_sw = active_sw;
	}

	public LocalDate getCreateddate() {
		return createddate;
	}

	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}

	public LocalDate getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(LocalDate updateddate) {
		this.updateddate = updateddate;
	}

	@Override
	public String toString() {
		return "UserAccounts [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", phno=" + phno + ", gender=" + gender + ", dob=" + dob + ", country=" + country
				+ ", state=" + state + ", city=" + city + ", active_sw=" + active_sw + ", createddate=" + createddate
				+ ", updateddate=" + updateddate + "]";
	}
	
}
