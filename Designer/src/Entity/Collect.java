package Entity;

public class Collect {
	private int collectId;// 收藏id，主键
	private int userId;// 用户id，外键
	private int proId;// 产品id，外键

	public Collect() {
		super();
	}

	public Collect(int collectId, int userId, int proId) {
		super();
		this.collectId = collectId;
		this.userId = userId;
		this.proId = proId;
	}

	@Override
	public String toString() {
		return "Collect [collectId=" + collectId + ", userId=" + userId + ", proId=" + proId + "]";
	}

	public int getCollectId() {
		return collectId;
	}

	public void setCollectId(int collectId) {
		this.collectId = collectId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

}
