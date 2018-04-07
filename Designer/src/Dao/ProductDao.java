package Dao;

import java.util.List;

import Entity.Product;

/**
 * 产品数据库操作接口
 * @author 吴家隆
 *
 */
public interface ProductDao {
	/**
	 * 添加新的产品
	 * @param product
	 * @return
	 */
	public Product AddProduct(Product product);
	/**
	 * 查询所有产品
	 * @return
	 */
	public List<Product> QueryAllProduct();
	/**
	 * 根据类型查询对应的产品
	 * @param typeid
	 * @return
	 */
	public List<Product> QueryProductByType(int typeid);
	/**
	 * 更新产品状态
	 * @param status  0代表正在销售，1表示正在已下架
	 * @return
	 */
	public Product UpdateProductStatus(int status);
}
