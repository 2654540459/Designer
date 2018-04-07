package Entity;

public class User {
	private int userId;// 用户id，主键
	private String userName;// 用户名
	private String loginName;// 用户登录名
	private String loginPwd;// 用户登陆密码
	private String gender;// 用户性别
	private String tel;// 用户手机
	private String email;// 用户邮箱
	private int addressId;// 用户收货地址id,外键
	private String openId;//微信绑定唯一识别码

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", loginName=" + loginName + ", loginPwd="
				+ loginPwd + ", gender=" + gender + ", tel=" + tel + ", email=" + email + ", addressId=" + addressId
				+ ", openId=" + openId + "]";
	}

	public User(int userId, String userName, String loginName, String loginPwd, String gender, String tel, String email,
			int addressId, String openId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.gender = gender;
		this.tel = tel;
		this.email = email;
		this.addressId = addressId;
		this.openId = openId;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
