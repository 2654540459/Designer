package Entity;

public class ReceivinAddress {
	private int addressId;// 收货地址Id，主键
	private int userId;// 用户id,外键
	private String contactTel;// 联系电话
	private String postcode;// 邮编
	private String province;// 省
	private String city;// 市
	private String district;// 区
	private String detailedAddress;// 详细地址

	public ReceivinAddress() {
		super();
	}

	public ReceivinAddress(int addressId, int userId, String contactTel, String postcode, String province, String city,
			String district, String detailedAddress) {
		super();
		this.addressId = addressId;
		this.userId = userId;
		this.contactTel = contactTel;
		this.postcode = postcode;
		this.province = province;
		this.city = city;
		this.district = district;
		this.detailedAddress = detailedAddress;
	}

	@Override
	public String toString() {
		return "ReceivinAddress [addressId=" + addressId + ", userId=" + userId + ", contactTel=" + contactTel
				+ ", postcode=" + postcode + ", province=" + province + ", city=" + city + ", district=" + district
				+ ", detailedAddress=" + detailedAddress + "]";
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

}
