package Dao;

import java.util.List;

import Entity.ReceivinAddress;
import Entity.User;

/**
 * @author 吴家隆
 *用户数据库操作接口
 */
public interface UserDao {
	/**
	 * 登陆验证
	 * @param loginname登录名
	 * @param loginpwd登录密码
	 * @return
	 */
	public User CheckUserLogin(String loginname,String loginpwd);
	/**
	 * 添加收货地址
	 * @param addres 
	 * @return
	 */
	public ReceivinAddress AddRecivinAddress(ReceivinAddress addres);
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public Boolean UpdateUserInformation(User user);
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public void AddUser(User user);
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> QueryAllUser();
	/**
	 * 验证用户登陆名是否存在
	 * @param loginname
	 * @return
	 */
	public Boolean CheckOnlyLoginName(String loginname);
}
