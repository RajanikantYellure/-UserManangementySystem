package com.bikkadIt.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Sate_Master")
public class StateMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="State_Id")
	private int stateid;
	
	@Column(name="State_Name")
	private String statename;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CityMaster cityMaster;

	public int getStateid() {
		return stateid;
	}

	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public CityMaster getCityMaster() {
		return cityMaster;
	}

	public void setCityMaster(CityMaster cityMaster) {
		this.cityMaster = cityMaster;
	}

	@Override
	public String toString() {
		return "StateMaster [stateid=" + stateid + ", statename=" + statename + ", cityMaster=" + cityMaster + "]";
	}
	

}
