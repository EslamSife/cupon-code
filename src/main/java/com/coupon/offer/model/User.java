package com.coupon.offer.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class User implements Serializable {

	private String userName;
	private String email;
	private String phoneNumber;
	private String registrationDate;
	private String address;
	private Date birthDate;
	private BigDecimal credit;
	private List<Coupon> coupons;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public BigDecimal getCredit() {
		return credit;
	}

	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}
	
	public List<Coupon> getCoupons() {
		return coupons;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", registrationDate=" + registrationDate + ", address=" + address + ", birthDate=" + birthDate
				+ ", credit=" + credit + "]";
	}

}
