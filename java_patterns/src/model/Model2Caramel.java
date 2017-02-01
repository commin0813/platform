package model;

public class Model2Caramel {
	private String classification;
	private String businessName;
	private String keyword;
	private String link;
	private String phone_num;
	private String address;
	private boolean isph;
	private boolean isSpeed;
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public boolean isSpeed() {
		return isSpeed;
	}

	public void setSpeed(boolean isSpeed) {
		this.isSpeed = isSpeed;
	}

	private String result;

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isIsph() {
		return isph;
	}

	public void setIsph(boolean isph) {
		this.isph = isph;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}



}
