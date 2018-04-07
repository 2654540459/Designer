package Dao;

import Entity.Order;

/**
 * 订单数据库操作接口
 * @author 吴家隆
 *
 */
public interface OrderDao {
	/**
	 * 生产订单
	 * @param ord
	 * @return
	 */
	public Boolean AddOrder(Order ord);
	/**
	 * 更新订单状态
	 * @param status
	 * @return
	 */
	public Boolean UpdateOrderStatus(int status);
	/**
	 * 取消订单
	 * @param OrdId
	 * @return
	 */
	public Boolean CancleOrder(int OrdId);
}
