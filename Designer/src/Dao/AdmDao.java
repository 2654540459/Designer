package Dao;

import Entity.Admin;

/**
 * 管理员数据库操作接口
 * @author 吴家隆
 *
 */
public interface AdmDao {	
	/**
	 * 管理员登陆验证
	 * @param loginname
	 * @param loginpwd
	 * @return
	 */
	public Admin CheckAdmLogin(String loginname,String loginpwd);
}
