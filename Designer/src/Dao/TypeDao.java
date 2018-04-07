package Dao;

import java.util.List;

import Entity.Type;

/**
 * 类型数据库操作接口
 * @author 吴家隆
 *
 */
public interface TypeDao {
	/**
	 * 添加一个新的类型
	 * @param type
	 * @return
	 */
	public Type AddType(Type type);
	/**
	 * 查询出所有类型
	 * @return
	 */
	public List<Type> QueryAllType();
	/**
	 * 通过typeId获取Type类
	 * @param typeid
	 * @return
	 */
	public Type QueryTypeById(int typeid);
}
