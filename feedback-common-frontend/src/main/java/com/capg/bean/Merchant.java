package com.capg.bean;

public class Merchant {
	
	
	private int mid;
	private String musername;
	private String mpassword;
	private String merchantType;
	private String response;
	private Feedback feedback;
	public Feedback getFeedback() {
		return feedback;
	}
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Merchant [mid=" + mid + ", musername=" + musername + ", mpassword=" + mpassword + ", merchantType="
				+ merchantType + ", response=" + response + "]";
	}
	public int getMid() {
		return mid;
	}
	
	public Merchant(int mid, String musername, String mpassword, String merchantType, String response,
			Feedback feedback) {
		super();
		this.mid = mid;
		this.musername = musername;
		this.mpassword = mpassword;
		this.merchantType = merchantType;
		this.response = response;
		this.feedback = feedback;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMusername() {
		return musername;
	}
	public void setMusername(String musername) {
		this.musername = musername;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public Merchant(int mid, String musername, String mpassword, String merchantType, String response) {
		super();
		this.mid = mid;
		this.musername = musername;
		this.mpassword = mpassword;
		this.merchantType = merchantType;
		this.response = response;
	}
	public Merchant() {
		
	}

}
