package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Piligrimage {
	
	
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="piligrimName", length=30)			
	private String piligrimName;
	private String piligrimDescription;
	private String piligrimPath;
	
	public Piligrimage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Piligrimage(int prodId, String piligrimName, String piligrimDescription, String piligrimPath) {
		super();
		this.prodId = prodId;
		this.piligrimName = piligrimName;
		this.piligrimDescription = piligrimDescription;
		this.piligrimPath = piligrimPath;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getPiligrimName() {
		return piligrimName;
	}

	public void setPiligrimName(String piligrimName) {
		this.piligrimName = piligrimName;
	}

	public String getPiligrimDescription() {
		return piligrimDescription;
	}

	public void setPiligrimDescription(String piligrimDescription) {
		this.piligrimDescription = piligrimDescription;
	}

	public String getPiligrimPath() {
		return piligrimPath;
	}

	public void setPiligrimPath(String piligrimPath) {
		this.piligrimPath = piligrimPath;
	}

	@Override
	public String toString() {
		return "Piligrimage [prodId=" + prodId + ", piligrimName=" + piligrimName + ", piligrimDescription="
				+ piligrimDescription + ", piligrimPath=" + piligrimPath + "]";
	}
	
	
	
	
}