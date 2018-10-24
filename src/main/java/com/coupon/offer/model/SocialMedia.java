package com.coupon.offer.model;

import java.io.Serializable;

public class SocialMedia implements Serializable {

	private Integer socialMediaId;
	private String facebookPage;
	private String instagram;
	private String twitter;
	private String buzz;

	public Integer getSocialMediaId() {
		return socialMediaId;
	}

	public void setSocialMediaId(Integer socialMediaId) {
		this.socialMediaId = socialMediaId;
	}

	public String getFacebookPage() {
		return facebookPage;
	}

	public void setFacebookPage(String facebookPage) {
		this.facebookPage = facebookPage;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getBuzz() {
		return buzz;
	}

	public void setBuzz(String buzz) {
		this.buzz = buzz;
	}

	@Override
	public String toString() {
		return "SocialMedia [socialMediaId=" + socialMediaId + ", facebookPage=" + facebookPage + ", instagram="
				+ instagram + ", twitter=" + twitter + ", buzz=" + buzz + "]";
	}
	
	

}
