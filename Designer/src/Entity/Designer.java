package Entity;

public class Designer {
		private int desId;//设计师id，主键
		private String desName;//设计师名
		private String loginName;//登录名
		private String loginPwd;//登陆密码
		private String tel;//设计师电话
		private String email;//设计师邮箱
		private String gender;//设计师姓名
		private String desIntroduction;//设计师介绍
		public Designer() {
			super();
		}
		public Designer(int desId, String desName, String loginName, String loginPwd, String tel, String email,
				String gender, String desIntroduction) {
			super();
			this.desId = desId;
			this.desName = desName;
			this.loginName = loginName;
			this.loginPwd = loginPwd;
			this.tel = tel;
			this.email = email;
			this.gender = gender;
			this.desIntroduction = desIntroduction;
		}
		@Override
		public String toString() {
			return "Designer [desId=" + desId + ", desName=" + desName + ", loginName=" + loginName + ", loginPwd="
					+ loginPwd + ", tel=" + tel + ", email=" + email + ", gender=" + gender + ", desIntroduction="
					+ desIntroduction + "]";
		}
		public int getDesId() {
			return desId;
		}
		public void setDesId(int desId) {
			this.desId = desId;
		}
		public String getDesName() {
			return desName;
		}
		public void setDesName(String desName) {
			this.desName = desName;
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDesIntroduction() {
			return desIntroduction;
		}
		public void setDesIntroduction(String desIntroduction) {
			this.desIntroduction = desIntroduction;
		}
		
		
}
