package com.coupon.offer.model;

import java.io.Serializable;
import java.util.List;

public class Vendor implements Serializable {

	private String vendorId;
	private String vendorName;
	private String address;
	private String phoneNumber;
	private String telephoneLine;
	private SocialMedia socialMedia;
	private List<Product> products;

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTelephoneLine() {
		return telephoneLine;
	}

	public void setTelephoneLine(String telephoneLine) {
		this.telephoneLine = telephoneLine;
	}

	public SocialMedia getSocialMedia() {
		return socialMedia;
	}

	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}

	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", telephoneLine=" + telephoneLine + ", socialMedia=" + socialMedia + "]";
	}

}
