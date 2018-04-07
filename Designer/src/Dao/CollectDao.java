package Dao;

import Entity.Collect;

/**
 * 收藏数夹据库操作接口
 * @author 吴家隆
 *
 */
public interface CollectDao {
	/**
	 * 添加收藏
	 * @param userid
	 * @param productid
	 * @return
	 */
	public Boolean AddCollect(int userid,int productid);
	/**
	 * 取消收藏
	 * @param collectid
	 * @return
	 */
	public Boolean RemoveCollect(int collectid);
}
