package com.hybe.ems.bo;

public class AdminBO {
private Long adminId;
private String firstName;
private String address;
private String mobileNum;
private String emailId;

public Long getAdminId() {
	return adminId;
}
public void setAdminId(Long adminId) {
	this.adminId = adminId;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobileNum() {
	return mobileNum;
}
public void setMobileNum(String mobileNum) {
	this.mobileNum = mobileNum;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
}
