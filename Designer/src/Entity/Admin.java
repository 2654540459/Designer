package Entity;

public class Admin {
	private int admId;//管理员id，主键
	private String admName;//管理员名
	private String loginName;//登录名
	private String loginPwd;//登录密码
	private String tel;//电话
	private String email;//邮箱
	public Admin() {
		super();
	}
	public Admin(int admId, String admName, String loginName, String loginPwd, String tel, String email) {
		super();
		this.admId = admId;
		this.admName = admName;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.tel = tel;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Admin [admId=" + admId + ", admName=" + admName + ", loginName=" + loginName + ", loginPwd=" + loginPwd
				+ ", tel=" + tel + ", email=" + email + "]";
	}
	public int getAdmId() {
		return admId;
	}
	public void setAdmId(int admId) {
		this.admId = admId;
	}
	public String getAdmName() {
		return admName;
	}
	public void setAdmName(String admName) {
		this.admName = admName;
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
	
}
