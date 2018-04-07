package Entity;

public class Order {
	private int ordId;// 订单id，外键
	private String ordTime;// 订单时间
	private int userId;// 用户id，外键
	private int proId;// 产品id,外键
	private int proNumber;// 订单购买产品数量
	private Double toalPrice;// 总价
	private String ordStatus;// 订单状态

	public Order() {
		super();
	}

	public Order(int ordId, String ordTime, int userId, int proId, int proNumber, Double toalPrice, String ordStatus) {
		super();
		this.ordId = ordId;
		this.ordTime = ordTime;
		this.userId = userId;
		this.proId = proId;
		this.proNumber = proNumber;
		this.toalPrice = toalPrice;
		this.ordStatus = ordStatus;
	}

	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordTime=" + ordTime + ", userId=" + userId + ", proId=" + proId
				+ ", proNumber=" + proNumber + ", toalPrice=" + toalPrice + ", ordStatus=" + ordStatus + "]";
	}

	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public String getOrdTime() {
		return ordTime;
	}

	public void setOrdTime(String ordTime) {
		this.ordTime = ordTime;
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

	public int getProNumber() {
		return proNumber;
	}

	public void setProNumber(int proNumber) {
		this.proNumber = proNumber;
	}

	public Double getToalPrice() {
		return toalPrice;
	}

	public void setToalPrice(Double toalPrice) {
		this.toalPrice = toalPrice;
	}

	public String getOrdStatus() {
		return ordStatus;
	}

	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}

}
