package Entity;

import java.util.Arrays;

public class Product {
	private int proId;// 产品id,主键
	private String proName;// 产品名
	private String proIntroduction;// 产品介绍
	private String[] proImgSrc;// 产品图片
	private Double proPrice;// 产品价格
	private int typeId;// 类型ID，外键
	private int quantityOrdered;// 订购数量
	private String proStatus;// 产品状态

	public Product() {
		super();
	}

	public Product(int proId, String proName, String proIntroduction, String[] proImgSrc, Double proPrice, int typeId,
			int quantityOrdered, String proStatus) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proIntroduction = proIntroduction;
		this.proImgSrc = proImgSrc;
		this.proPrice = proPrice;
		this.typeId = typeId;
		this.quantityOrdered = quantityOrdered;
		this.proStatus = proStatus;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proIntroduction=" + proIntroduction
				+ ", proImgSrc=" + Arrays.toString(proImgSrc) + ", proPrice=" + proPrice + ", typeId=" + typeId
				+ ", quantityOrdered=" + quantityOrdered + ", proStatus=" + proStatus + "]";
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProIntroduction() {
		return proIntroduction;
	}

	public void setProIntroduction(String proIntroduction) {
		this.proIntroduction = proIntroduction;
	}

	public String[] getProImgSrc() {
		return proImgSrc;
	}

	public void setProImgSrc(String[] proImgSrc) {
		this.proImgSrc = proImgSrc;
	}

	public Double getProPrice() {
		return proPrice;
	}

	public void setProPrice(Double proPrice) {
		this.proPrice = proPrice;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public String getProStatus() {
		return proStatus;
	}

	public void setProStatus(String proStatus) {
		this.proStatus = proStatus;
	}

}
