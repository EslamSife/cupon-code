package com.coupon.offer.model;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {

	private String productId;
	private String name;
	private String termOfUse;
	private String description;
	private Vendor vendor;
	private Category category;
	private List<Coupon> coupons;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTermOfUse() {
		return termOfUse;
	}

	public void setTermOfUse(String termOfUse) {
		this.termOfUse = termOfUse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", termOfUse=" + termOfUse + ", description="
				+ description + ", vendor=" + vendor + ", category=" + category + "]";
	}

}
