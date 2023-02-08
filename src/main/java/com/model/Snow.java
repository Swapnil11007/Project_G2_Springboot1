package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Snow {
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="snowName", length=30)			
	private String snowName;
	private String snowDescription;
	private String snowPath;
	public Snow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Snow(int prodId, String snowName, String snowDescription, String snowPath) {
		super();
		this.prodId = prodId;
		this.snowName = snowName;
		this.snowDescription = snowDescription;
		this.snowPath = snowPath;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getSnowName() {
		return snowName;
	}
	public void setSnowName(String snowName) {
		this.snowName = snowName;
	}
	public String getSnowDescription() {
		return snowDescription;
	}
	public void setSnowDescription(String snowDescription) {
		this.snowDescription = snowDescription;
	}
	public String getSnowPath() {
		return snowPath;
	}
	public void setSnowPath(String snowPath) {
		this.snowPath = snowPath;
	}
	@Override
	public String toString() {
		return "Snow [prodId=" + prodId + ", snowName=" + snowName + ", snowDescription=" + snowDescription
				+ ", snowPath=" + snowPath + "]";
	}
	
	
}
