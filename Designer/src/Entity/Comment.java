package Entity;

public class Comment {
	private int comId;
	private String comContent;
	private String userName;
	private String comTime;
	private int proId;

	public Comment() {
		super();
	}

	public Comment(int comId, String comContent, String userName, String comTime, int proId) {
		super();
		this.comId = comId;
		this.comContent = comContent;
		this.userName = userName;
		this.comTime = comTime;
		this.proId = proId;
	}

	@Override
	public String toString() {
		return "Comment [comId=" + comId + ", comContent=" + comContent + ", userName=" + userName + ", comTime="
				+ comTime + ", proId=" + proId + "]";
	}

	public int getComId() {
		return comId;
	}

	public void setComId(int comId) {
		this.comId = comId;
	}

	public String getComContent() {
		return comContent;
	}

	public void setComContent(String comContent) {
		this.comContent = comContent;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getComTime() {
		return comTime;
	}

	public void setComTime(String comTime) {
		this.comTime = comTime;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

}
