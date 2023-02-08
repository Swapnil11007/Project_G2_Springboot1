package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Safari {
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="safariName", length=30)			
	private String safariName;
	private String safariDescription;
	private String safariPath;
	
	public Safari() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Safari(int prodId, String safariName, String safariDescription, String safariPath) {
		super();
		this.prodId = prodId;
		this.safariName = safariName;
		this.safariDescription = safariDescription;
		this.safariPath = safariPath;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getSafariName() {
		return safariName;
	}

	public void setSafariName(String safariName) {
		this.safariName = safariName;
	}

	public String getSafariDescription() {
		return safariDescription;
	}

	public void setSafariDescription(String safariDescription) {
		this.safariDescription = safariDescription;
	}

	public String getSafariPath() {
		return safariPath;
	}

	public void setSafariPath(String safariPath) {
		this.safariPath = safariPath;
	}

	@Override
	public String toString() {
		return "Safari [prodId=" + prodId + ", safariName=" + safariName + ", safariDescription=" + safariDescription
				+ ", safariPath=" + safariPath + "]";
	}
	
	

}
