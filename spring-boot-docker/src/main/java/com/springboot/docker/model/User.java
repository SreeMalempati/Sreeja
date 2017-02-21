/**
 * 
 */
package com.springboot.docker.model;

public class User {

	String FirstName;
	String LastName;
	String EmailId;
	String phone;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [FirstName=" + FirstName + ", LastName=" + LastName + ", EmailId=" + EmailId + ", phone=" + phone
				+ "]";
	}
}
