package com.example.qualitelogiciel.model;

import java.util.Date;
import java.util.Objects;

public class User {
	private String mail;
	private String password;
	private String username;
	private String phoneNumber;
	private Date birthday;
	private String road;
	private String postalCode;
	private String City;
	private boolean isAdmin;
	public User(String mail, String password, String username, String phoneNumber, Date birthday, String road,
			String postalCode, String city, boolean isAdmin) {
		super();
		this.mail = mail;
		this.password = password;
		this.username = username;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.road = road;
		this.postalCode = postalCode;
		this.City = city;
		this.isAdmin = isAdmin;
	}

	public User() {
	}

	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(City, birthday, isAdmin, mail, password, phoneNumber, postalCode, road, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(City, other.City) && Objects.equals(birthday, other.birthday) && isAdmin == other.isAdmin
				&& Objects.equals(mail, other.mail) && Objects.equals(password, other.password)
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(postalCode, other.postalCode)
				&& Objects.equals(road, other.road) && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "User [mail=" + mail + ", password=" + password + ", username=" + username + ", phoneNumber="
				+ phoneNumber + ", birthday=" + birthday + ", road=" + road + ", postalCode=" + postalCode + ", City="
				+ City + ", isAdmin=" + isAdmin + "]";
	}
	

}
