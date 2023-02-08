package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adventure {
	
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="adventureName", length=30)			
	private String adventureName;
	private String adventureDescription;
	private String adventurePath;
	public Adventure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adventure(int prodId, String adventureName, String adventureDescription, String adventurePath) {
		super();
		this.prodId = prodId;
		this.adventureName = adventureName;
		this.adventureDescription = adventureDescription;
		this.adventurePath = adventurePath;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getAdventureName() {
		return adventureName;
	}
	public void setAdventureName(String adventureName) {
		this.adventureName = adventureName;
	}
	public String getAdventureDescription() {
		return adventureDescription;
	}
	public void setAdventureDescription(String adventureDescription) {
		this.adventureDescription = adventureDescription;
	}
	public String getAdventurePath() {
		return adventurePath;
	}
	public void setAdventurePath(String adventurePath) {
		this.adventurePath = adventurePath;
	}
	@Override
	public String toString() {
		return "Adventure [prodId=" + prodId + ", adventureName=" + adventureName + ", adventureDescription="
				+ adventureDescription + ", adventurePath=" + adventurePath + "]";
	}
	
	

}
