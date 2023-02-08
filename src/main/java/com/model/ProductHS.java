
package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductHS {
	
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="prodName", length=30)			
	private String productName;
	private double productPrice;
	private String productDescription;
	private String productPath;
	
	public ProductHS() {
		super();
		
	}

	public ProductHS(int prodId, String productName, double productPrice, String productDescription,
			String productPath) {
		super();
		this.prodId = prodId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productPath = productPath;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductPath() {
		return productPath;
	}

	public void setProductPath(String productPath) {
		this.productPath = productPath;
	}

	@Override
	public String toString() {
		return "ProductHS [prodId=" + prodId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", productPath=" + productPath + "]";
	}
	
	
	
}
	