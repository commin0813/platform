package model;

public class Model2Caramel {
	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	private String classification;

	private String businessName;
	private String keyword;
	private String detail_keyword;

	private String phone_num;
	private String address;
	private boolean isph;
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

	public String getDetail_keyword() {
		return detail_keyword;
	}

	public void setDetail_keyword(String detail_keyword) {
		this.detail_keyword = detail_keyword;
	}

}
