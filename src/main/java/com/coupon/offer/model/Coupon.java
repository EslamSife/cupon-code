package com.coupon.offer.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Coupon implements Serializable {

	private Integer couponId;
	private String code;
	private Date createDate;
	private Date expireDate;
	private Product product;
	private List<User> users;

	public Integer getCouponId() {
		return couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", code=" + code + ", createDate=" + createDate + ", expireDate="
				+ expireDate + "]";
	}

}
