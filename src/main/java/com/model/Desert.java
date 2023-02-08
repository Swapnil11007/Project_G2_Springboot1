package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Desert {
	
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="desertName", length=30)			
	private String desertName;
	private String desertDescription;
	private String desertPath;
	
	public Desert() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Desert(int prodId, String desertName, String desertDescription, String desertPath) {
		super();
		this.prodId = prodId;
		this.desertName = desertName;
		this.desertDescription = desertDescription;
		this.desertPath = desertPath;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getDesertName() {
		return desertName;
	}

	public void setDesertName(String desertName) {
		this.desertName = desertName;
	}

	public String getDesertDescription() {
		return desertDescription;
	}

	public void setDesertDescription(String desertDescription) {
		this.desertDescription = desertDescription;
	}

	public String getDesertPath() {
		return desertPath;
	}

	public void setDesertPath(String desertPath) {
		this.desertPath = desertPath;
	}

	@Override
	public String toString() {
		return "Desert [prodId=" + prodId + ", desertName=" + desertName + ", desertDescription=" + desertDescription
				+ ", desertPath=" + desertPath + "]";
	}
	
	

}
