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
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="City_Master")
public class CityMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="City_Id")
	private int cityid;
	
	@Column(name="City_name")
	private String cityname;

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "CityMaster [cityid=" + cityid + ", cityname=" + cityname + "]";
	}
	
	
	
	
	

}
