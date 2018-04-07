package DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.UserDao;
import Entity.ReceivinAddress;
import Entity.User;
import Util.DBUtil;

public class UserDaoImol implements UserDao {
	DBUtil util = DBUtil.getInstance();
	@Override
	public User CheckUserLogin(String loginname, String loginpwd) {
		String sql = "select * from user where LoginName = ? and LoginPwd = ?";
		User user = null;
		ResultSet rs = util.query(sql, loginname,loginpwd);
		try {
			while(rs.next()) {
				user = new User();
				user.setAddressId(rs.getInt("AddressId"));
				user.setEmail(rs.getString("Email"));
				user.setGender(rs.getString("Gender"));
				user.setLoginName(rs.getString("LoginName"));
				user.setLoginPwd(rs.getString("LoginPwd"));
				user.setOpenId(rs.getString("OpenId"));
				user.setTel(rs.getString("Tel"));
				user.setUserId(rs.getInt("UserId"));
				user.setUserName(rs.getString("UserName"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close();
		}
		return user;
	}

	@Override
	public ReceivinAddress AddRecivinAddress(ReceivinAddress addres) {
		return null;
	}

	@Override
	public Boolean UpdateUserInformation(User user) {
		return null;
	}

	@Override
	public void AddUser(User user) {
		String sql = "insert into user(UserName,LoginName,LoginPwd) vakues(?,?,?)";
		util.update(sql, user.getUserName(),user.getLoginName(),user.getLoginPwd());
	}

	@Override
	public List<User> QueryAllUser() {
		String sql = "select * from user";
		List<User> list = new ArrayList<User>();
		User user = null;
		ResultSet rs = util.query(sql);
		try {
			while(rs.next()) {
				user = new User();
				user.setAddressId(rs.getInt("AddressId"));
				user.setEmail(rs.getString("Email"));
				user.setGender(rs.getString("Gender"));
				user.setLoginName(rs.getString("LoginName"));
				user.setLoginPwd(rs.getString("LoginPwd"));
				user.setOpenId(rs.getString("OpenId"));
				user.setTel(rs.getString("Tel"));
				user.setUserId(rs.getInt("UserId"));
				user.setUserName(rs.getString("UserName"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			util.close();
		}
		return list;
	}

	@Override
	public Boolean CheckOnlyLoginName(String loginname) {
		List<User> users = QueryAllUser();
		for (User user : users) {
			if(user.getLoginName().equals(loginname)) {
				return false;
			}
		}
		return true;
	}

}
