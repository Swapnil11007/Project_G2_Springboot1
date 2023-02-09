package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Home {
	
	@Id@GeneratedValue
	private int id;
	private String name;
	private String description;
	private int rating;
	private String imgPath;
	private String route;
	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Home(int id, String name, String description, int rating, String imgPath, String route) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rating = rating;
		this.imgPath = imgPath;
		this.route = route;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Home [id=" + id + ", name=" + name + ", description=" + description + ", rating=" + rating
				+ ", imgPath=" + imgPath + ", route=" + route + "]";
	}
	
}
