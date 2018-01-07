package com.SpringJDBC.Model;

import java.sql.Date;

public class Employee {
private String userName;
private String firstName;
private String lastName;
private String dob;
private String Email;

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}


}
