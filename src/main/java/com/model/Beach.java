package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beach {
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="beachName", length=30)			
	private String beachName;
	private String beachDescription;
	private String beachPath;
	
	public Beach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Beach(int prodId, String beachName, String beachDescription, String beachPath) {
		super();
		this.prodId = prodId;
		this.beachName = beachName;
		this.beachDescription = beachDescription;
		this.beachPath = beachPath;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getBeachName() {
		return beachName;
	}

	public void setBeachName(String beachName) {
		this.beachName = beachName;
	}

	public String getBeachDescription() {
		return beachDescription;
	}

	public void setBeachDescription(String beachDescription) {
		this.beachDescription = beachDescription;
	}

	public String getBeachPath() {
		return beachPath;
	}

	public void setBeachPath(String beachPath) {
		this.beachPath = beachPath;
	}

	@Override
	public String toString() {
		return "Beach [prodId=" + prodId + ", beachName=" + beachName + ", beachDescription=" + beachDescription
				+ ", beachPath=" + beachPath + "]";
	}
	
	
}
