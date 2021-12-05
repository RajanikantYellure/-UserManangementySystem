package com.bikkadIt.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Country_Master")
public class CountryMaster {
	
	@Column(name="Country_Id")
	private int countryId;
	
	@Column(name="Country_Name")
	private String countryName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private StateMaster stateMaster;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public StateMaster getStateMaster() {
		return stateMaster;
	}

	public void setStateMaster(StateMaster stateMaster) {
		this.stateMaster = stateMaster;
	}

	@Override
	public String toString() {
		return "CountryMaster [countryId=" + countryId + ", countryName=" + countryName + ", stateMaster=" + stateMaster
				+ "]";
	}
	
	
	

}
