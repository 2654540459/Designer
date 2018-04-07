package Entity;

public class Type {
	private int typeId;// 类型id,主键
	private int typeName;// 类型名

	public Type() {
		super();
	}

	public Type(int typeId, int typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", typeName=" + typeName + "]";
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getTypeName() {
		return typeName;
	}

	public void setTypeName(int typeName) {
		this.typeName = typeName;
	}

}
