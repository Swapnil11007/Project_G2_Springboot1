package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	private int userId;
	private String userName;
	private String emailId;
	private String mobileNumber;
	private String password;
	
	public Users() {
		super();
	}
	
	public Users(int userId, String userName, String emailId, String mobileNumber, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", mobileNumber="
				+ mobileNumber + ", password=" + password + "]";
	}
	
	

}
